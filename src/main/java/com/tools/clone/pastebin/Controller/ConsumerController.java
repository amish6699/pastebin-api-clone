package com.tools.clone.pastebin.Controller;

import com.tools.clone.pastebin.Model.dto.ConsumerRequest;
import com.tools.clone.pastebin.Model.dto.ConsumerResponse;
import com.tools.clone.pastebin.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @PostMapping("/save-consumer")
    public ResponseEntity<ConsumerResponse> saveConsumerCreationRequest(@RequestBody ConsumerRequest consumerRequest) {
        return new ResponseEntity<>(consumerService.saveConsumer(consumerRequest), HttpStatus.OK);
    }

}
