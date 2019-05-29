package com.example.myapplication.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Bean {
    @Id
    private Long id;
    private String name;
    private String img;

    public Bean(String name, String img) {
        this.name = name;
        this.img = img;
    }

    @Generated(hash = 1594074797)
    public Bean(Long id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }
    @Generated(hash = 80546095)
    public Bean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
}
