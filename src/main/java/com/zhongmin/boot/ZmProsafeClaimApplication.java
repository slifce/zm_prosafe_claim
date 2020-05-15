package com.zhongmin.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhongmin.*.dao")
@SpringBootApplication
public class ZmProsafeClaimApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmProsafeClaimApplication.class, args);
	}

}
