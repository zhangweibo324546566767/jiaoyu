package com.roncoo; /**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户服务
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RefreshScope
@MapperScan("com.roncoo.mapper")
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
