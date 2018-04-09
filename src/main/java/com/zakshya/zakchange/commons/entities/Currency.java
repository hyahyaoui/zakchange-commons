package com.zakshya.zakchange.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Currency {
    private String code;
    private String name;
}
