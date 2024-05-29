package com.go.backend_crud.model.auth.response;

import java.util.UUID;
import lombok.Data;

@Data
public class RegisterResponse {
    private Object createdDate;
    private Object createdBy;
    private Object updatedDate;
    private Object updatedBy;
    private UUID id;
    private String email;
    private String password;
    private String userType;
}
