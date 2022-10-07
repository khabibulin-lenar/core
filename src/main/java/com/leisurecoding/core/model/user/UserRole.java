package com.leisurecoding.core.model.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserRole {
    ADMIN(Roles.ADMIN),
    CUSTOMER(Roles.CUSTOMER);

    private final String role;

    public String getRole() {
        return role;
    }

    public static final class Roles {
        public static final String ADMIN = "ADMIN";
        public static final String CUSTOMER = "CUSTOMER";
    }
}
