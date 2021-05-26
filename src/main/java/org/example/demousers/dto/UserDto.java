package org.example.demousers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String id;
    private String username;
    private String email;
    private String userTypeId;
    private String userTypeCode;
    private String userTypeDescription;

}
