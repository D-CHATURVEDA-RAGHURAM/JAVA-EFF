package com.example.NotificationService.Service;

import com.example.NotificationService.Entity.NotificationRequest;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(NotificationRequest request) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(request.getRecipient());
            helper.setSubject(request.getSubject());
            helper.setText(request.getMessage(), true);

            mailSender.send(message);
            System.out.println("📧 Email Sent Successfully to " + request.getRecipient());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
