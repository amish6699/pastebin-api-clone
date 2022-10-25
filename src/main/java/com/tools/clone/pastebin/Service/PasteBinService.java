package com.tools.clone.pastebin.Service;

import com.tools.clone.pastebin.Model.dto.PasteBinRequest;
import com.tools.clone.pastebin.Model.dto.PasteBinResponse;

import javax.servlet.http.HttpServletRequest;

public interface PasteBinService {

    PasteBinResponse savePasteBinRequest(PasteBinRequest pasteBinRequest, HttpServletRequest httpServletRequest);
    PasteBinResponse getPasteByUrl(String urlUuid);
}
