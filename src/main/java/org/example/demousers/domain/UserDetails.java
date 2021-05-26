package org.example.demousers.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDetails {

    @Id
    private Long id;
    private String username;
    private String email;
    private Long userTypeId;

}
