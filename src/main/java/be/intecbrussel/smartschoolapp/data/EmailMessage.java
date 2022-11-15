package be.intecbrussel.smartschoolapp.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EmailMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String recipient;
    private String subject;
    private String message;
    private String attachment;
    private LocalDateTime receivedAt;
    private LocalDateTime sentAt;

    @PrePersist
    protected void oneSent() {
        this.sentAt = LocalDateTime.now();
        this.receivedAt = LocalDateTime.now();
    }
}