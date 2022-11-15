package be.intecbrussel.smartschoolapp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String relation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="classTeacher_id")
    private ClassTeacher classTeacher;


    @OneToOne(fetch = FetchType.LAZY)
    private Student student;

    public Parent(String firstName, String lastName, String email, String password, String relation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.relation = relation;
    }
}
