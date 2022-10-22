package com.tools.clone.pastebin.Repository;

import com.tools.clone.pastebin.Model.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
