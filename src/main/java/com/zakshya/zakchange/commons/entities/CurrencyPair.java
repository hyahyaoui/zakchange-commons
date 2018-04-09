package com.zakshya.zakchange.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyPair {

    /**
     * Base Currency code
     */
    private String base;
    /**
     * Counter Currency code
     */
    private String counter;

    @Override
    public String toString() {
        return base.concat("/").concat(counter);
    }
}
