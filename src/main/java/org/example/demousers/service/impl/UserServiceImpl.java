package org.example.demousers.service.impl;

import org.example.demousers.domain.UserDetails;
import org.example.demousers.repository.UserRepository;
import org.example.demousers.service.UserService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Mono<UserDetails> create(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    @Override
    public Mono<UserDetails> getById(String id) {
        return userRepository.findById(id);
    }
}
