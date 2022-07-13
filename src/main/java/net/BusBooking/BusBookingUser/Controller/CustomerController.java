package net.BusBooking.BusBookingUser.Controller;

import net.BusBooking.BusBookingUser.Entity.Customer;
import net.BusBooking.BusBookingUser.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    @PostMapping("/customerName")
    public List<Customer> getCustomerByNameAndNumber(@RequestParam String customerName,@RequestParam String customerNumber){

        return customerRepository.findByCustomerNameAndCustomerNumber(customerName,customerNumber);
    }
    @PutMapping("/updateCustomerNameAndNumber")
    public Customer updateCustomerNameAndNumber(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
