package com.tools.clone.pastebin.Service.impl;

import com.tools.clone.pastebin.Service.PasteBinService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public class PasteBinServiceImpl implements PasteBinService {
}
