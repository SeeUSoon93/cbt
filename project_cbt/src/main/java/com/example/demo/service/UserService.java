package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public Long save(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return userRepository.save(User.builder()
                .userEmail(user.getUserEmail())
                .userPw(encoder.encode(user.getUserPw()))
                .build()).getUserIdx();
    }

    public User findByUserEmail(String email){
        return userRepository.findByUserEmail(email)
                .orElseThrow(()-> new IllegalArgumentException("Unexpected user"));
    }
}
