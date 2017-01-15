package com.example.blog;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by chirs on 1/15/2017.
 */
@ConfigurationProperties(prefix="com.example.blog")
public class BlogProperties {

    @Value("${com.example.blog.name}")
    private String name;//博客作者

    @Value("${com.example.blog.title}")
    private String title;//博客标题

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
