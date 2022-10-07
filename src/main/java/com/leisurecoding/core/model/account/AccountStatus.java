package com.leisurecoding.core.model.account;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountStatus {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    DORMANT("DORMANT"),
    BLOCKED("BLOCKED");

    private final String status;

    private String getStatus() {
        return status;
    }
}
