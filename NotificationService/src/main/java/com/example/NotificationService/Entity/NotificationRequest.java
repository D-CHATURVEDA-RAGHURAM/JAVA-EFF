package com.example.NotificationService.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private String recipient;
    private String subject;
    private String message;
    private NotificationType type;
}