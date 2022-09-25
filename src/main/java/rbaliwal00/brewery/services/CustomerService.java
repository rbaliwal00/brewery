package rbaliwal00.brewery.services;

import org.springframework.stereotype.Service;
import rbaliwal00.brewery.web.model.CustomerDto;

import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
