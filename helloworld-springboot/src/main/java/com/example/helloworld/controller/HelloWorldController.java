package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final AccountsService accountsService;
	private final Account testModel;

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello, World!";
    }


    

	@Autowired
	public AccountsController(AccountsService accountsService) {
		this.accountsService = accountsService;
	}

	
	public Account getLatestInfo()
	{
		this.accountsService.createAccount(testModel);
	}
}
