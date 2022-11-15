package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long> {
}
