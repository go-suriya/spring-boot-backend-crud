package com.go.backend_crud.model.auth.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String email;

    private String password;

    private String userType;
}