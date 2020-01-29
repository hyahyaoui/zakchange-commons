package com.zakshya.zakchange.commons.market.entities;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Currency {
    @NonNull
    private String code;
    @NonNull
    private String name;
}
