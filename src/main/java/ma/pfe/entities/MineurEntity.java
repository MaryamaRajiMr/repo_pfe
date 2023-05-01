package ma.pfe.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("m")
public class MineurEntity extends StudentEntity {

}
