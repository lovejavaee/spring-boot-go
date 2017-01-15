package com.example.blog;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chirs on 1/15/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BlogPropertiesTest{

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void testBlog() throws Exception {
        System.out.println("AppTest.testBlog()=" + blogProperties);
        Assert.assertEquals("Angel", blogProperties.getName());
        Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());
    }
}