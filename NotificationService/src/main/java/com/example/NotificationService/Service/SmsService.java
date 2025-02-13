package com.example.NotificationService.Service;

import com.example.NotificationService.Entity.NotificationRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;

    public void sendSms(NotificationRequest request) {
        Message.creator(
                new PhoneNumber(request.getRecipient()),
                new PhoneNumber(twilioPhoneNumber),
                request.getMessage()
        ).create();
        System.out.println("📱 SMS Sent Successfully to " + request.getRecipient());
    }
}
