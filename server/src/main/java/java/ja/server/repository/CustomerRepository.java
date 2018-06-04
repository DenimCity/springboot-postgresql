package java.ja.server.repository;


import org.springframework.data.repository.CrudRepository;

import java.ja.server.model.Customer;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findLastName(String lastName);

}


