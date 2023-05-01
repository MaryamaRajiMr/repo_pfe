package ma.pfe.entities;
// Represente la table

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_STUDENTS")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="C_TYPE_STUDENT")
//@DiscriminatorValue("s")
public class StudentEntity {

    @EmbeddedId
    private StudentId id;

    @Column(name="name_student")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })
    private Adresse adresse;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private List<CourseEntity> courses;

    public StudentId getId() {
        return id;
    }

    public void setId(StudentId id) {
        this.id = id;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + id +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
