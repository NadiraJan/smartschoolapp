package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.EmailMessage;
import be.intecbrussel.smartschoolapp.repositories.EmailMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.time.LocalDateTime;

@Service
public class EmailMessageService {
    @Autowired
    private EmailMessageRepository emailMessageRepository;
 /*   @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendEmail(EmailMessage emailMessage) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;

        try {
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(emailMessage.getRecipient());
            mimeMessageHelper.setText(emailMessage.getMessage());
            mimeMessageHelper.setSubject(emailMessage.getSubject());

            FileSystemResource file = new FileSystemResource(new File(emailMessage.getAttachment()));
            mimeMessageHelper.addAttachment(file.getFilename(), file);

            javaMailSender.send(mimeMessage);
            return "Mail sent Successfully";

        } catch (MessagingException e) {
            return "Error while sending mail!!!";

        }
    }*/
}


//Pearl:
   /* public void sendEmail(EmailMessage emailMessage) {


        emailMessage.setSentAt(LocalDateTime.now());
        //this will keep backup in database
        emailMessageRepository.save(emailMessage);
        //This will send to a real email
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(emailMessage.getRecipient());
        simpleMailMessage.setSubject(emailMessage.getSubject());
        simpleMailMessage.setText(emailMessage.getMessage());
        this.mailSender.send(simpleMailMessage);

    }*/
