package com.ibm.vend0tron3000;

import com.ibm.vend0tron3000.repository.ProductRepository;
import com.ibm.vend0tron3000.servlet.TransactionServlet;
import com.ibm.vend0tron3000.servlet.VendingServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendingmachineApplication extends SpringBootServletInitializer {

	ProductRepository conn = new ProductRepository();

	public static void main(String[] args) {
		SpringApplication.run(VendingmachineApplication.class, args);
//		ProductRepository productRepository = new ProductRepository();
//		productRepository.printProduct(productRepository.getProductByid(4));
	}

	@Bean
	public ServletRegistrationBean vendingServletRegistration(){
		return new ServletRegistrationBean(new VendingServlet(),"/index");
	}

	@Bean
	public ServletRegistrationBean transactionServletRegistration(){
		return new ServletRegistrationBean(new TransactionServlet(),"/transaction");
	}
}
