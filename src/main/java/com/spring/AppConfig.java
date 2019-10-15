package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ClassRoom getClassRoom()
    {
        return new ClassRoom();
    }
    @Bean FlippedClassRoom getflippedclass()
    {
        return new FlippedClassRoom();
    }
    @Bean
    public Location getLocation()
    {
        return new Location();
    }
    @Bean
    public Mentor getMentor()
    {
        return new Mentor();
    }


    @Bean
    public Student getStudent()
    {
        return new Student();
    }
}
