package com.demo.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.producer.Rider;

@RestController
@RequestMapping("/api/kafka")
public class kafkaProducer {

    private KafkaTemplate<String, Rider> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, Rider> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public ResponseEntity<Rider> publish(@RequestParam("id") String id, @RequestParam("name") String name,
            @RequestParam("location") String location) {
        Rider rider = new Rider(id, name, location);
        kafkaTemplate.send("my-topic-from-spring", rider);
        return ResponseEntity.ok(rider);
    }

}
