package be.intecbrussel.smartschoolapp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentDetailsId;
    private String userName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="student_id", nullable = false)
    private Student student;


}
