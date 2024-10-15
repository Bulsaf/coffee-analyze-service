package com.test.coffee_service.coffee_arrivals;

import jakarta.annotation.Nonnull;

public interface ArrivalService {

    void saveArrival(@Nonnull ArrivalEvent newArrivalEvent);

}
