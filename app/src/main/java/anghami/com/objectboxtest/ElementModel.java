package anghami.com.objectboxtest;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created on 07/11/2018.
 */
@Entity
public class ElementModel {
  @Id public long _id;

  public String data;
}
