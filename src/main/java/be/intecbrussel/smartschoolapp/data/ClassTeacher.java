package be.intecbrussel.smartschoolapp.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class ClassTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long phoneNumber;

@OneToMany(mappedBy = "classTeacher", cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<>();
    public Set<Student> getStudents() {
        return students;
    }
    public void setStudent(Set<Student> students) {
        this.students = students;
        for (Student s : students) {
            s.setClassTeacher(this);
        }
    }

    @OneToMany(mappedBy = "classTeacher", cascade = CascadeType.ALL)
    private Set<Parent>parents = new HashSet<>();
    public Set<Parent> getParent() {
        return parents;
    }
    public void setTeachersModel(Set<Parent> parents) {
        this.parents = parents;
        for (Parent p : parents) {
            p.setClassTeacher(this);
        }
    }


    @OneToOne(fetch = FetchType.LAZY)
    private TimeTable timeTable;


    public ClassTeacher(String firstName, String lastName, String email, String password, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
