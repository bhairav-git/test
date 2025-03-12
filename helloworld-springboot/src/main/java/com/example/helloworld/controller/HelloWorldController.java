package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final AccountsService testService;
    private final Account testModel;

	@Autowired
	public HelloWorldController(AccountsService accountsService) {
		this.testService = testService;
	}

	
	public Account getLatestInfo()
	{
		this.testService.createAccount(testModel);
	}
}
