package com.test.coffee_analyze_service.coffee_arrivals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalEvent {

    private Integer quantity;
    private String originCountry;
    private BigDecimal arabicaPercentage;
    private BigDecimal robustPercentage;
    private String coffeeVariate;

}
