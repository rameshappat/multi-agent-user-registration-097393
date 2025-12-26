package com.northerntrust.registration;

import org.springframework.stereotype.Service;

@Service
public class OtpService {

    public String generateOtp() {
        // Generate a time-based OTP
        return String.valueOf((int)(Math.random() * 10000)); // Placeholder for actual OTP generation logic
    }

    public void sendOtp(String email, String otp) {
        // Logic to send OTP via SendGrid or Twilio
        System.out.println("Sending OTP: " + otp + " to: " + email);
    }
}