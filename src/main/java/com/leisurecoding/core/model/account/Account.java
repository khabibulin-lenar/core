package com.leisurecoding.core.model.account;

import com.leisurecoding.core.model.user.CustomerUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = "^(\\d{12})$")
    private String accountNumber;
    @NotNull
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @NotNull
    @PositiveOrZero
    private BigDecimal actualBalance;
    @NotNull
    @PositiveOrZero
    private BigDecimal availableBalance;

    @OneToOne
    @JoinColumn(name = "user_id")
    private CustomerUser user;
}
