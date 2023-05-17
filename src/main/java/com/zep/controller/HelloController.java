package com.zep.controller;


import com.zep.config.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(DataSourceProperties.class)
@RestController
public class HelloController {

    @Autowired
    private DataSourceProperties dataSourceProperties;


    @RequestMapping("/hello")
    public String toHello(){
        return "Hello Spring Boot Self";
    }

    @RequestMapping("/dataSource")
    public String toDataSource(){
        System.out.println(dataSourceProperties);
        return "Hello SpringBoot DSP";
    }

    @RequestMapping("/dataSource")
    public String toDataSource1(){
        System.out.println(dataSourceProperties);
        return "Hello SpringBoot DSP";
    }

    @RequestMapping("/dataSource")
    public String toDataSource1dev(){
        System.out.println(dataSourceProperties);
        return "Hello SpringBoot DSP";
    }

    @RequestMapping("/dataSource")
    public String toDataSource1dev2(){
        System.out.println(dataSourceProperties);
        return "Hello SpringBoot DSP";
    }

    @RequestMapping("/dataSource")
    public String toDataSource1dev3(){
        System.out.println(dataSourceProperties);
        return "Hello SpringBoot DSP";
    }

}
