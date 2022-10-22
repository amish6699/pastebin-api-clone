package com.tools.clone.pastebin.Model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PasteBinResponse {

    private String username;
    private String url;
}
