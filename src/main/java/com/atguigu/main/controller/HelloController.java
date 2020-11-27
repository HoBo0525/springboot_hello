package com.atguigu.main.controller;

import com.atguigu.main.bean.DataSourceProperties;
import com.atguigu.main.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Autowired
    JdbcProperties jdbcProperties;
    @RequestMapping("/hello")
    public String sayHello(){



        //System.out.println(dataSourceProperties);
        System.out.println(jdbcProperties);
        return "hello spring boot!!" ;
    }
}
