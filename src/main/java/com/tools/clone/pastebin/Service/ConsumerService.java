package com.tools.clone.pastebin.Service;

import com.tools.clone.pastebin.Model.dto.ConsumerRequest;
import com.tools.clone.pastebin.Model.dto.ConsumerResponse;
import com.tools.clone.pastebin.Model.vo.Consumer;

public interface ConsumerService {
    ConsumerResponse saveConsumer(ConsumerRequest consumerRequest);
}
