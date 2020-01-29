package com.zakshya.zakchange.commons.validation;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class ValidationResult {
    @NonNull
    private ValidationStatus status;
    private Set<String> reasons = new HashSet<String>();

    public String getReasonsAsString() {
        return reasons.stream()
                .reduce((previous
                        , current) -> previous.concat("\n" + current))
                .orElse("");
    }
}
