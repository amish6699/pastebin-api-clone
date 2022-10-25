package com.tools.clone.pastebin.Model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PASTEBIN")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PasteBin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private String user_name;
    @JsonProperty("expiration_time")
    private Long expirationTime;// in minutes
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crt_date;
    private String url;
}
