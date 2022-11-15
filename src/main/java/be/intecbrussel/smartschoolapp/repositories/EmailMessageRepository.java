package be.intecbrussel.smartschoolapp.repositories;

import be.intecbrussel.smartschoolapp.data.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailMessageRepository extends JpaRepository<EmailMessage,String> {
}
