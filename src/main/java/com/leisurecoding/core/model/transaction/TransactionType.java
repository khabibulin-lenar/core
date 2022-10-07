package com.leisurecoding.core.model.transaction;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TransactionType {
    FUND_TRANSFER("FUND_TRANSFER"),
    MERCHANT_PAYMENT("MERCHANT_PAYMENT");

    private final String type;

    private String getType() {
        return type;
    }
}
