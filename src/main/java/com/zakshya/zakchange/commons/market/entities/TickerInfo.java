package com.zakshya.zakchange.commons.market.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TickerInfo {
    private String base;
    private String counter;
    private double price;
    private double change24Hour;
    private double changePct24hour;
    private double openDay;
    private double highDay;
    private double lowDay;
    private double open24Hour;
    private double high24Hour;
    private double low24Hour;
}