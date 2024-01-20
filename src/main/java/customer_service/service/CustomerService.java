package customer_service.service;

import customer_service.model.Customer;
import customer_service.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void insertCustomer(Customer customer) {

        customerRepository.saveAndFlush(customer);
    }

    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();
    }
}
