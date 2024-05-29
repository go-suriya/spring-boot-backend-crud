package com.go.backend_crud.repository;

import com.go.backend_crud.model.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String> {
    AccountEntity findByEmail(String email);
}
