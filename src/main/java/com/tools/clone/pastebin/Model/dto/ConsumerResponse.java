package com.tools.clone.pastebin.Model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumerResponse {

    private Long userId;
    private String username;
    private String status;

}
