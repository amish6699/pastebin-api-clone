package com.tools.clone.pastebin.Repository;

import com.tools.clone.pastebin.Model.vo.Pastebin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasteBinRepository extends JpaRepository<Pastebin,Long> {
}
