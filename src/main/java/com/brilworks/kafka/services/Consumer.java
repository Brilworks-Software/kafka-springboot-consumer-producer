package com.brilworks.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.brilworks.kafka.services.Constant.CHANNEL_GROUP;
import static com.brilworks.kafka.services.Constant.CHANNEL_TOPIC;

@Service
public class Consumer {


    @KafkaListener(topics = CHANNEL_TOPIC, groupId = CHANNEL_GROUP)
    public void readMessage(String message){
        System.out.println(message);
    }
}
