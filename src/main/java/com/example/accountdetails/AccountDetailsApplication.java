package com.example.accountdetails;


import com.example.accountdetails.model.Account;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class AccountDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountDetailsApplication.class, args);
    }

}
