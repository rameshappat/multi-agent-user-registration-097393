package com.northerntrust.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private OtpService otpService;
    @Autowired
    private UserRepository userRepository;

    public void registerUser(UserRegistrationRequest request) {
        // Validate and save user
        User user = new User(request.getEmail(), request.getPassword());
        userRepository.save(user);
        // Generate and send OTP
        String otp = otpService.generateOtp();
        otpService.sendOtp(request.getEmail(), otp);
    }
}