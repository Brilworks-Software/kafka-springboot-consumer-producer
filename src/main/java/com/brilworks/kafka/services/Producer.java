package com.brilworks.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.brilworks.kafka.services.Constant.CHANNEL_TOPIC;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String messageName){
        kafkaTemplate.send(CHANNEL_TOPIC,messageName);
    }
}
