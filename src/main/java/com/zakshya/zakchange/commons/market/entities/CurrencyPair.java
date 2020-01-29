package com.zakshya.zakchange.commons.market.entities;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CurrencyPair {

    /**
     * Base Currency code
     */
    @NonNull
    private String base;
    /**
     * Counter Currency code
     */
    @NonNull
    private String counter;

    @Override
    public String toString() {
        return base.concat("/").concat(counter);
    }
}
