package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class consumerMessage {
    @KafkaListener(topics = "my-topic", groupId = "group-A")
    public void getMessage(String message) {
        System.out.println("Received message: " + message);
    }

    @KafkaListener(topics = "my-topic", groupId = "group-B")
    public void getMessage2(String message) {
        System.out.println("Received message: " + message);
    }

}
