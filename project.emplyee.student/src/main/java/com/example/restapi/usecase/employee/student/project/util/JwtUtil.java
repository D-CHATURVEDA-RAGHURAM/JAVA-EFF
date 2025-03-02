package com.example.restapi.usecase.employee.student.project.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "XJ7MWiRJvJhj7xAMT5r7mERHBSF1p2yY7IivwMVVpEc="; // Use a strong key
    private final long EXPIRATION_MS = 1000 * 60 * 60; // 1 hour
    
    private byte[] getSecretKey() {
        return Base64.getDecoder().decode(SECRET_KEY);
    }

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_MS))
                .signWith(SignatureAlgorithm.HS256, getSecretKey()) // ✅ FIXED: Use proper secret key
                .compact();
    }

    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                   .setSigningKey(getSecretKey()) // ✅ FIXED: Proper key parsing
                   .build()
                   .parseClaimsJws(token)
                   .getBody();
    }
}
