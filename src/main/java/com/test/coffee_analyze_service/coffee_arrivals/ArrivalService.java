package com.test.coffee_analyze_service.coffee_arrivals;

import jakarta.annotation.Nonnull;

public interface ArrivalService {

    void saveArrival(@Nonnull ArrivalEvent newArrivalEvent);

}
