package com.zakshya.zakchange.commons.market.exceptions;

import lombok.Getter;

public class InvalidMarketEntryException extends RuntimeException {

    @Getter
    private final MarketEntry marketEntry;

    public InvalidMarketEntryException(String message, MarketEntry marketEntry) {
        super(message);
        this.marketEntry = marketEntry;
    }
}
