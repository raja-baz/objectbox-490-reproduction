package anghami.com.objectboxtest;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created on 07/11/2018.
 */
@Entity
public class UnrelatedModel {
  @Id long _id;

  String data;
}
