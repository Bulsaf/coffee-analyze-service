package com.test.coffee_service.coffee_arrivals;

import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArrivalServiceImpl implements ArrivalService{

    @Transactional
    @Override
    public void saveArrival(@Nonnull ArrivalEvent newArrivalEvent) {

    }

}
