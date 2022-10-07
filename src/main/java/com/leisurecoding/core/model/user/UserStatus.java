package com.leisurecoding.core.model.user;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserStatus {
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    DISABLED("DISABLED"),
    BLACKLIST("BLACKLIST");

    private final String status;

    private String getStatus() {
        return status;
    }
}
