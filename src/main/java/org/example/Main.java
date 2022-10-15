package org.example;

import org.example.config.SpringConfig;
import org.example.domain.Account;
import org.example.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountServiceImpl accountService = ctx.getBean(AccountServiceImpl.class);
        Account account = accountService.findById(2);
        System.out.println(account);
    }
}