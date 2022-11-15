package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable,Long> {
}
