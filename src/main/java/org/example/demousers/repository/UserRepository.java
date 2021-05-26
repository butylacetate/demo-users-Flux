package org.example.demousers.repository;

import org.example.demousers.domain.UserDetails;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserDetails, String> {

//    @Override
//    @Query("select u.*, ut.code as \"user_type_code\", ut.description as \"user_type_description\" from users u left join user_type ut on u.user_type_id = ut.id and u.id = :userId")
//    Mono<User> findById(String userId);
}
