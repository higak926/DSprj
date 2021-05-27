package com.DSprj.DSprj002.kajitool.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"kajitool.dao.mapper", "com.DSprj.DSprj002.kajitool.view.mapper"})
public class MyBatisConfig {
}
