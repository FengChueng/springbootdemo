package com.example.pojo;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SystemBean {
    @Id
    private String id;
    private String name;//唯一不可重复
    private List<String> schools;//学校列表
    private Set<Authority> authorities;//shiro权限列
    private List<TradeTag> tradeTags;//系统商品分类表
}