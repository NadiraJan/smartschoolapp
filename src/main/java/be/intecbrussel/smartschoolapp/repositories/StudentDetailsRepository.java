package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Long> {
}
