package java.ja.server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.ja.server.model.Customer;
import java.ja.server.repository.CustomerRepository;

@RestController
 public class CustomerController{

@Autowired
    CustomerRepository repository;


@RequestMapping("/save")
    public String process(){
    repository.save(new Customer("Jack", "Smith"));
    repository.save(new Customer("Jean", "Altidor"));
    repository.save(new Customer("France", "Perez"));
    repository.save(new Customer("Julia", "Matthews"));
    return "Done";
}


@RequestMapping("/findall")
    public String findAll() {
    String result - "<html>";

    for(Customer cust : repository.findAll()){
        result += "<div>" + cust.toString() + "</div>";
    }
}

 }