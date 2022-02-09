package com.vikas.runner;

import com.vikas.document.Customer;
import com.vikas.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerRunner  implements CommandLineRunner {

    @Autowired
    private CustomerRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();

        repo.save(new Customer(1002,"Wills","will123@gmail.com",55000));
        repo.save(new Customer(1003,"Smith","smith52@gmail.com",45000));

        repo.findAll().forEach(System.out::println);

    }
}
