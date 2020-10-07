package com.atom.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atom.springcloud.dao"})
public class MyBatisConfig {
}
