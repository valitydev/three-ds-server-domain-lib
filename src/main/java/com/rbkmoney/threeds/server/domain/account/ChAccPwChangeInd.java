package com.rbkmoney.threeds.server.domain.account;

import com.fasterxml.jackson.annotation.JsonValue;
import com.rbkmoney.threeds.server.domain.Valuable;
import lombok.RequiredArgsConstructor;

/**
 * Cardholder Account Password Change Indicator
 * <p>
 * Indicates the length of time since the cardholder’s account with the 3DS Requestor
 * had a password change or account reset.
 * <p>
 * Length: 2 characters
 * <p>
 * JSON Data Type: String
 */
@RequiredArgsConstructor
public enum ChAccPwChangeInd implements Valuable {

    NO_CHANGE("01"),

    THIS_TRANSACTION("02"),

    LESS_THEN_30_DAYS("03"),

    FROM_30_TO_60_DAYS("04"),

    MORE_THAN_60_DAYS("05");

    private final String value;

    @JsonValue
    @Override
    public String getValue() {
        return value;
    }
}
