package anghami.com.objectboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class MainActivity extends AppCompatActivity {

  private static BoxStore sBoxStore;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (sBoxStore == null) {
      sBoxStore = MyObjectBox.builder().androidContext(getApplicationContext()).buildDefault();
      populate();
    }
  }

  private void populate() {
    final Box<ElementModel> elementBox = sBoxStore.boxFor(ElementModel.class);
    if (elementBox.query().build().findFirst() != null) {
      return;
    }

    sBoxStore.runInTx(new Runnable() {
      @Override
      public void run() {
        ContainerModel containerModel = new ContainerModel();
        for (int i = 0; i < 100; i++) {
          ElementModel model = new ElementModel();
          model.data = "something";
          elementBox.put(model);
          containerModel.elements.add(model);
        }
        sBoxStore.boxFor(ContainerModel.class).put(containerModel);
      }
    });
  }
}
