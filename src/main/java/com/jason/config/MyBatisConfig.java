package com.jason.config;

import com.jason.mapper.MyBatis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jason on 2016-09-03.
 */
@Configuration
@MapperScan(value = "com.jason.mapper", markerInterface = MyBatis.class)
public class MyBatisConfig {
}
