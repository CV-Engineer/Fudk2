package com.itszt.Controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.itszt.Mapper.FuckerMapper;
import com.itszt.pojo.Fucker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FuckerMapper fuckerMapper;

    @GetMapping("show")
    public String test(){

        System.out.println("cao ni ma");
            return "caonima";
    }

    @GetMapping("fuck")
    public String test2(){

        System.out.println("cao ni ma");
        return "caonimalegebi";
    }

    @Autowired
    private DruidDataSource dataSource;

    @GetMapping("{name}")
    public Fucker queryUserByName(@PathVariable("name") String name ){

        System.out.println("branch 1");

        return this.fuckerMapper.selectByPrimaryKey(name);

    }





}
