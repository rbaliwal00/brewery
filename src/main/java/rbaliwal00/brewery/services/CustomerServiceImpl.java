package rbaliwal00.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rbaliwal00.brewery.web.model.BeerDto;
import rbaliwal00.brewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Rajan")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer...");
    }


}
