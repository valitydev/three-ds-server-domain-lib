package com.rbkmoney.threeds.server.domain.challenge;

import com.fasterxml.jackson.annotation.JsonValue;
import com.rbkmoney.threeds.server.domain.Valuable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChallengeWindowSize implements Valuable {

    VERY_LOW("01"),
    LOW("02"),
    MEDIUM("03"),
    HIGH("04"),
    FULL_SCREEN("05");

    private final String value;

    @JsonValue
    @Override
    public String getValue() {
        return value;
    }
}
