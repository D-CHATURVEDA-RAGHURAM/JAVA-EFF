package com.effigo.paymentintegration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.effigo.paymentintegration.mapper")
@ComponentScan("com.effigo.paymentintegration")

public class PaymentIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentIntegrationApplication.class, args);
	}

}
