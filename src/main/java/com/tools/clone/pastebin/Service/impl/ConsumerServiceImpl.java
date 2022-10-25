package com.tools.clone.pastebin.Service.impl;

import com.tools.clone.pastebin.Model.dto.ConsumerRequest;
import com.tools.clone.pastebin.Model.dto.ConsumerResponse;
import com.tools.clone.pastebin.Model.vo.Consumer;
import com.tools.clone.pastebin.Repository.ConsumerRepository;
import com.tools.clone.pastebin.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;


@Repository
@Transactional(readOnly = true)
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Override
    @Transactional
    public ConsumerResponse saveConsumer(ConsumerRequest consumerRequest) {
        Consumer consumer = Consumer.builder()
                .name(consumerRequest.getName())
                .username(UUID.randomUUID().toString())
                .crt_date(new Date())
                .password(consumerRequest.getPassword()).build();
        consumerRepository.save(consumer);
        ConsumerResponse consumerResponse;
        if (consumer.getId() > 0) {
            consumerResponse = ConsumerResponse.builder().status("created")
                    .userId(consumer.getId())
                    .username(consumer.getUsername()).build();
        } else {
            consumerResponse = ConsumerResponse.builder().status("error: unable to create").build();
        }

        return consumerResponse;
    }



}
