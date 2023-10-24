package com.ssafy.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.ssafy.board.model.dao") //Main에 붙여도 되긴 하다만 깔끔한 구조를 위해...
public class DBConfig {
	
}
