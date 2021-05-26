package org.example.demousers.service;

import org.example.demousers.domain.UserDetails;

import reactor.core.publisher.Mono;

public interface UserService {

    Mono<UserDetails> create(UserDetails userDetails);

    Mono<UserDetails> getById(String id);
}
