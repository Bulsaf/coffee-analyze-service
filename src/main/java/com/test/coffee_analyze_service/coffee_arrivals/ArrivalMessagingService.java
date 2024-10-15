package com.test.coffee_analyze_service.coffee_arrivals;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArrivalMessagingService {

    private static final String receiveTopic = "${topic.receive-arrival}";
    private static final String consumerGroupId = "${kafka.consumer.group-id}";
    private final ArrivalService arrivalService;

    @Transactional
    @KafkaListener(topics = receiveTopic, groupId = consumerGroupId, properties = {
            "spring.json.value.default.type=com.test.coffee_analyze_service.coffee_arrivals.ArrivalEvent"
    })
    public ArrivalEvent receiveArrivalEvent(ArrivalEvent newArrivalEvent) {
        log.info("Receive arrival event: {}", newArrivalEvent);
        arrivalService.saveArrival(newArrivalEvent);
        return newArrivalEvent;
    }

}
