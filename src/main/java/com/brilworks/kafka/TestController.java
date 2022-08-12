package com.brilworks.kafka;

import com.brilworks.kafka.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.kafka.common.serialization.StringSerializer;
@RestController
public class TestController {

    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public void publish(@RequestParam("message") String message){
        producer.sendMessage(message);
    }
}
