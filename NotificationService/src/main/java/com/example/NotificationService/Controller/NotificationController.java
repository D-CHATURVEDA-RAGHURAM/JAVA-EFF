package com.example.NotificationService.Controller;

import com.example.NotificationService.Entity.NotificationRequest;
import com.example.NotificationService.Entity.NotificationType;
import com.example.NotificationService.Service.EmailService;
import com.example.NotificationService.Service.SmsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final EmailService emailService;
    private final SmsService smsService;

    public NotificationController(EmailService emailService, SmsService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    @PostMapping("/send")
    public String sendNotification(@RequestBody NotificationRequest request) {
        if (request.getType() == NotificationType.EMAIL) {
            emailService.sendEmail(request);
            return "📧 Email Sent!";
        } else if (request.getType() == NotificationType.SMS) {
            smsService.sendSms(request);
            return "📱 SMS Sent!";
        }
        return "❌ Invalid Notification Type";
    }
}
