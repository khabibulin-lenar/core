package com.leisurecoding.core.repository;

import com.leisurecoding.core.model.user.CustomerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerUserRepository extends JpaRepository<CustomerUser, Long> {
    Optional<CustomerUser> findByIdentificationNumber(String identificationNumber);
}
