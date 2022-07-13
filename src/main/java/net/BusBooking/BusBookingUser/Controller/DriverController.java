package net.BusBooking.BusBookingUser.Controller;

import net.BusBooking.BusBookingUser.Entity.Driver;
import net.BusBooking.BusBookingUser.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;
    @GetMapping("/drivers")
    public List<Driver> getAllDriver(){
        return driverRepository.findAll();
    }
}
