package com.tools.clone.pastebin.Controller;

import com.tools.clone.pastebin.Model.dto.PasteBinRequest;
import com.tools.clone.pastebin.Model.dto.PasteBinResponse;
import com.tools.clone.pastebin.Service.PasteBinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/paste-bin")
public class PasteBinController {

    @Autowired
    private PasteBinService pasteBinService;

    @PostMapping("/save-paste")
    public ResponseEntity<PasteBinResponse> savePasteBinRequest(@RequestBody PasteBinRequest pasteBinRequest, HttpServletRequest httpServletRequest) {
        return new ResponseEntity<>(pasteBinService.savePasteBinRequest(pasteBinRequest, httpServletRequest), HttpStatus.OK);
    }

    @GetMapping("/{urlUuid}")
    public ResponseEntity<PasteBinResponse> getPasteByUrl(@PathVariable String urlUuid, HttpServletRequest httpServletRequest) {
        return new ResponseEntity<>(pasteBinService.getPasteByUrl(ServletUriComponentsBuilder.fromContextPath(httpServletRequest).replacePath(null).build().toUriString() + "/paste-bin/" + urlUuid), HttpStatus.OK);
    }
}
