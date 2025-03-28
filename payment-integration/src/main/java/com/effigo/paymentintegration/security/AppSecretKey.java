package com.effigo.paymentintegration.security;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Base64;

@Component
public class AppSecretKey {

    private static final Integer APP_SECRET_KEY_LENGTH=16;

    public String generateRandomBase64Token(int byteLength) {
        SecureRandom secureRandom=new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(token);
    }

    public String encryptProperty(String originalPropertyName, String secretKey){
        String base64EncryptedStr= AESEncryptionAlgo.encrypt(originalPropertyName,secretKey);
        return base64EncryptedStr;
    }

    public String decryptProperty(String encryptedPropertyName, String secretKey){
        String base64DecryptedStr= AESEncryptionAlgo.decrypt(encryptedPropertyName,secretKey);
        return base64DecryptedStr;
    }
}
