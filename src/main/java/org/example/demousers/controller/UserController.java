package org.example.demousers.controller;

import org.example.demousers.domain.UserDetails;
import org.example.demousers.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public Mono<UserDetails> create(@RequestBody UserDetails userDetails) {
        return userService.create(userDetails);
    }

    @GetMapping(path = "/{userId}")
    public Mono<UserDetails> getById(@PathVariable String userId) {
        return userService.getById(userId);
    }
}

