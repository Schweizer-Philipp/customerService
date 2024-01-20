package customer_service.controller;

import customer_service.model.Customer;
import customer_service.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    private ResponseEntity<?> addCustomer(@Valid @RequestBody Customer customer) {

        customerService.insertCustomer(customer);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/customers")
    private ResponseEntity<List<Customer>> addCustomer() {
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

}
