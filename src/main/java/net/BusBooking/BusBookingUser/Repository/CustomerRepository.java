package net.BusBooking.BusBookingUser.Repository;

import net.BusBooking.BusBookingUser.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByCustomerNameAndCustomerNumber(String customerName, String customerNumber);
}
