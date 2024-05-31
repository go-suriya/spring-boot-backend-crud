package com.go.backend_crud.service;

import com.go.backend_crud.exception.ResourceNotFoundException;
import com.go.backend_crud.model.auth.dto.RegisterDto;
import com.go.backend_crud.model.entity.AccountEntity;
import com.go.backend_crud.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public AccountEntity createAccount(RegisterDto user) {
        try {
            AccountEntity accountEntity = new AccountEntity();
            accountEntity.setEmail(user.getEmail());
            accountEntity.setPassword(user.getPassword());
            accountEntity.setUserType(user.getUserType());

            return accountRepository.save(accountEntity);
        } catch (DataIntegrityViolationException e) {
            throw new ResourceNotFoundException("Duplicate key value violates unique constraint");
        }
    }
}
