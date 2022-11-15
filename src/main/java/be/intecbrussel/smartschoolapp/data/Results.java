package be.intecbrussel.smartschoolapp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(length=255, nullable = false)
    private Subjects subjects;
    private double maxPoint;
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;


    public Results(Subjects subjects, double maxPoint, String remarks, Student student) {
        this.subjects = subjects;
        this.maxPoint = maxPoint;
        this.remarks = remarks;
        this.student = student;
    }
}
