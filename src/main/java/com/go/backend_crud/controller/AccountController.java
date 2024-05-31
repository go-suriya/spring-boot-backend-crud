package com.go.backend_crud.controller;

import com.go.backend_crud.exception.SuccessResponse;
import com.go.backend_crud.model.ResponseModel;
import com.go.backend_crud.model.auth.dto.RegisterDto;
import com.go.backend_crud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<ResponseModel> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(new SuccessResponse(
                String.valueOf(HttpStatus.CREATED.value()),
                "Success",
                accountService.createAccount(registerDto))
        );
    }

}
