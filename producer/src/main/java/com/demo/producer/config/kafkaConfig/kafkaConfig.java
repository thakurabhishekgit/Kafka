package com.demo.producer.config.kafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaConfig {
    @Bean
    public NewTopic createTopic() {
        return new NewTopic("my-topic-from-spring", 1, (short) 1);
    }
}
