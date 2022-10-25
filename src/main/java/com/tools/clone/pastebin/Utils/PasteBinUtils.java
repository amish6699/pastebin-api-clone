package com.tools.clone.pastebin.Utils;

import com.tools.clone.pastebin.Model.vo.PasteBin;
import com.tools.clone.pastebin.Repository.PasteBinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PasteBinUtils {

    @Autowired
    private PasteBinRepository pasteBinRepository;

    //create a scheduler
    @Scheduled(fixedDelay = 60000)
    public void removeExpiredPaste() {
        List<PasteBin> pasteBinList = pasteBinRepository.findAll();
        for(PasteBin obj : pasteBinList){
            if((new Date().getTime()-obj.getCrt_date().getTime())/60000 > obj.getExpirationTime()){
                pasteBinRepository.delete(obj);
            }
        }
    }
}
