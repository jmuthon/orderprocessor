package com.orderprocessor;

import com.orderprocessor.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderprocessorApplication {

	public static void main(String[] args) {
		//UserController userController = new UserController();
		//userController.createUser("June");
		//userController.createUser("Simoun");
		//userController.createUser("Sharuon");
		SpringApplication.run(OrderprocessorApplication.class, args);
	}

}
