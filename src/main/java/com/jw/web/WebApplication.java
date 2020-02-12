package com.jw.web;

import com.jw.web.accessingdatajpa.UserRepository;
import com.jw.web.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // save a few customers
        repository.save(new User("Jack", "Bauer"));
        repository.save(new User("Chloe", "O'Brian"));
        repository.save(new User("Kim", "Bauer"));
        repository.save(new User("David", "Palmer"));
        repository.save(new User("Michelle", "Dessler"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (User customer : repository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        User customer = repository.findById(1L);
        log.info("Customer found with findById(1L):");
        log.info("--------------------------------");
        log.info(customer.toString());
        log.info("");

        // fetch customers by last name
        log.info("Customer found with findByLastName('Bauer'):");
        log.info("--------------------------------------------");
        repository.findByAccountId("Bauer").forEach(bauer -> {
            log.info(bauer.toString());
        });
        // for (Customer bauer : repository.findByLastName("Bauer")) {
        //  log.info(bauer.toString());
        // }
        log.info("");
    }
}
