package com.tools.clone.pastebin.Model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PasteBinRequest {

    private String body;
    private String username;
}
