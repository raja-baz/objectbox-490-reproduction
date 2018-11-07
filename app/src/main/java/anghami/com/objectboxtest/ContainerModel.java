package anghami.com.objectboxtest;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

/**
 * Created on 07/11/2018.
 */
@Entity
public class ContainerModel {
  @Id public long _id;
}
