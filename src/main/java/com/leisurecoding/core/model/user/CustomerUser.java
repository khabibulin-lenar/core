package com.leisurecoding.core.model.user;

import com.leisurecoding.core.model.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(UserRole.Roles.CUSTOMER)
public class CustomerUser extends User {
    @NotNull
    @Pattern(regexp = "^(\\d{12})$")
    private String identificationNumber;
    @NotNull
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @OneToOne(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Account account;
}
