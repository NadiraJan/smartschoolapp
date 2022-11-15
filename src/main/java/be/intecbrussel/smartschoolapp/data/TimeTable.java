package be.intecbrussel.smartschoolapp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 255, nullable = false)
    private Subjects subjects;

    @Enumerated(EnumType.STRING)
    @Column(length = 255, nullable = false)
    private Day day;

    private LocalTime beginTime;
    private LocalTime endTime;

    @OneToOne(mappedBy = "timeTable", cascade = CascadeType.ALL)
    private ClassTeacher classTeacher;

    @Override
    public String toString() {
        return "TimeTable{" +
                "id=" + id +
                ", subjects=" + subjects +
                ", day=" + day +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", classTeacher=" + classTeacher +
                '}';
    }
}
