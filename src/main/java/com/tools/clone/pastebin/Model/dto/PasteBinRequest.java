package com.tools.clone.pastebin.Model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PasteBinRequest {

    private String body;
    private String username;
    private Long expirationTime; // in minutes
    private String url;
}
