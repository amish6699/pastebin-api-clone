package com.tools.clone.pastebin.Model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PasteBinResponse {

    private String username;
    private String url;
    private String status;
    private String body;
}
