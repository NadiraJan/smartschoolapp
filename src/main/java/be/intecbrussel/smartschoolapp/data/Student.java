package be.intecbrussel.smartschoolapp.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private String gender;
    private String grade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classTeacher_id")
    private ClassTeacher classTeacher;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Results> results;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "student")
    private Parent parent;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<StudentDetails> getStudentDetails = new HashSet<>();
    public Set<StudentDetails> getStudentDetails() {
        return getStudentDetails;
    }

    public Student(String firstName, String lastName, String email, String password, int age, String gender, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public void setStudentDetails(Set<StudentDetails> studentDetails) {
        this.getStudentDetails = studentDetails;
        for (StudentDetails d : studentDetails) {
            d.setStudent(this);



        }
    }
}
