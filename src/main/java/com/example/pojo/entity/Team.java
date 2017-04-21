package com.example.pojo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    private String description;
    private List<String> trades;
    private String school;
    private String authorId;
    private String img;
    private String idImg;
    private boolean status;
}
