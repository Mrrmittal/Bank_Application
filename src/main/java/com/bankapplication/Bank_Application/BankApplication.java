package com.bankapplication.Bank_Application;

import com.bankapplication.Bank_Application.Service.ServiceImpl.OperationImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		OperationImpl operation = new OperationImpl();
		operation.bankInfo();
		SpringApplication.run(BankApplication.class, args);
	}

}
