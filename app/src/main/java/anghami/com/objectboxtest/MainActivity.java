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
    }
  }
}
