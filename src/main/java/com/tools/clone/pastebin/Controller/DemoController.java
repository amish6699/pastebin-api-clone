package com.tools.clone.pastebin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getDemo")
    public String get(){
        return "Hello PasteBin Users!!!";
    }

}
