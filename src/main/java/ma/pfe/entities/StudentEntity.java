package ma.pfe.entities;
// Represente la table

import javax.persistence.*;

@Entity
@Table(name = "T_STUDENTS")
public class StudentEntity {

    @Id
    @Column(name="id_student")
    private long id;

    @Column(name="name_student")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
