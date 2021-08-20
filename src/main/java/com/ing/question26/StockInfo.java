package com.ing.question26;

import java.math.BigDecimal;

public final class StockInfo {

    private final String name ;
    private final BigDecimal value ;

    public StockInfo(String name, BigDecimal value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }


}
