package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Long> {
}
