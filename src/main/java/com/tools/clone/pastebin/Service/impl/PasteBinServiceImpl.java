package com.tools.clone.pastebin.Service.impl;

import com.tools.clone.pastebin.Model.dto.PasteBinRequest;
import com.tools.clone.pastebin.Model.dto.PasteBinResponse;
import com.tools.clone.pastebin.Model.vo.PasteBin;
import com.tools.clone.pastebin.Repository.PasteBinRepository;
import com.tools.clone.pastebin.Service.PasteBinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Repository
@Transactional(readOnly = true)
public class PasteBinServiceImpl implements PasteBinService {

    @Autowired
    private PasteBinRepository pasteBinRepository;

    @Override
    @Transactional
    public PasteBinResponse savePasteBinRequest(PasteBinRequest pasteBinRequest, HttpServletRequest httpServletRequest) {
        PasteBin pasteBin = PasteBin.builder().body(pasteBinRequest.getBody())
                .expirationTime(pasteBinRequest.getExpirationTime())
                .user_name(pasteBinRequest.getUsername())
                .crt_date(new Date())
                .url(ServletUriComponentsBuilder.fromContextPath(httpServletRequest).replacePath(null).build().toUriString() + "/paste-bin/" + UUID.randomUUID().toString()).build();

        pasteBin = pasteBinRepository.save(pasteBin);
        PasteBinResponse pasteBinResponse;
        if (pasteBin.getId() > 0) {
            pasteBinResponse = PasteBinResponse.builder()
                    .username(pasteBin.getUser_name())
                    .url(pasteBin.getUrl())
                    .status("paste created").build();
        } else {
            pasteBinResponse = PasteBinResponse.builder()
                    .username(pasteBin.getUser_name())
                    .status("error: unable to create").build();
        }
        return pasteBinResponse;
    }

    @Override
    public PasteBinResponse getPasteByUrl(String url) {
        List<PasteBin> pasteBinList = pasteBinRepository.findByUrl(url);
        PasteBin pasteBin = pasteBinList != null && pasteBinList.size()>0? pasteBinList.get(0) : null;
        PasteBinResponse pasteBinResponse;
        if (pasteBin != null) {
            pasteBinResponse = PasteBinResponse.builder()
                    .username(pasteBin.getUser_name())
                    .body(pasteBin.getBody()).build();
        } else {
            pasteBinResponse = PasteBinResponse.builder()
                    .status("error: paste with url is not present").build();
        }
        return pasteBinResponse;
    }
}
