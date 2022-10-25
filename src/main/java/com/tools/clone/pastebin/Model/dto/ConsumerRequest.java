package com.tools.clone.pastebin.Model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumerRequest {

    private String name;
    private String password;
    private String username;

}
