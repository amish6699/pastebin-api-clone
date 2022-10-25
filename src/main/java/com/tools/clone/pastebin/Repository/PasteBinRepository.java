package com.tools.clone.pastebin.Repository;

import com.tools.clone.pastebin.Model.vo.PasteBin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PasteBinRepository extends JpaRepository<PasteBin,Long> {

    List<PasteBin> findByUrl(String url);
}
