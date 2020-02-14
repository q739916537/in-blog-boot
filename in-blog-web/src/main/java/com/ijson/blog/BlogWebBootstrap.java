package com.ijson.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:applicationContext.xml"})
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableCaching
public class BlogWebBootstrap {

    public static void main(String[] args) {
        //System.setProperty("logback.configurationFile", "/Users/cuiyongxu/logback.xml");
        System.setProperty("file.encoding", "UTF-8");
        SpringApplication.run(BlogWebBootstrap.class, args);
    }

}
