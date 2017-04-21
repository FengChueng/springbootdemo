package com.example.pojo.entity;

import lombok.Builder;
import lombok.Setter;

import java.util.Date;

@Setter
@Builder
public class Token {
    private String id;
    private String issuer;
    private String subject;
    private Date expiration;
}
