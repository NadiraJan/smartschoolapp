package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.ClassTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTeacherRepository extends JpaRepository<ClassTeacher, Long> {
}
