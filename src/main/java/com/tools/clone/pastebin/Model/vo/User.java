package com.tools.clone.pastebin.Model.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "USER")
@Data
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date crt_date;
}
