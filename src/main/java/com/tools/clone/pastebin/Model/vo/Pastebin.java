package com.tools.clone.pastebin.Model.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "PASTEBIN")
@Data
public class Pastebin {

    @Id
    private Long id;
    private String body;
    private String user_name;
    @Temporal(TemporalType.DATE)
    private Date crt_date;
}
