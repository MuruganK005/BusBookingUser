package net.BusBooking.BusBookingUser.Controller;

import net.BusBooking.BusBookingUser.Entity.Bus;
import net.BusBooking.BusBookingUser.Repository.BusRepository;
import net.BusBooking.BusBookingUser.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.sql.Time;
import java.util.List;

@RestController
public class BusController {
    @Autowired
    private BusService busService;
    @Autowired
    private BusRepository busRepository;
    @GetMapping("/busBySrcAndDest")
    public List<Bus> getBusBySrcAndDest(@RequestParam String source, @RequestParam String destination){
        return busService.getBusBySrcAndDest(source,destination);
    }
    @GetMapping("/busBySrcAndDestAtTime")
    public List<Bus> getBusBySrcAndDestAtTime(@RequestParam String source, @RequestParam String destination, @RequestParam String time){
        return busService.getBusBySrcAndDestAtTime(source,destination,time);
    }
    @GetMapping("/busBySrcDestTimePrice")
    public List<Bus> getBusByDestTimePrice(@RequestParam String source, @RequestParam String destination, @RequestParam String time, @RequestParam String price){
        return busService.filterBusByPriceSrcAndDestAtTime(source,destination,time,price);
    }
    @PostMapping("/busDetails")
    public Bus getBusDetails(@RequestBody Bus bus){

        return busRepository.save(bus);
    }
    @GetMapping("/busDetails")
    public List<Bus> getBusDetailsInList(@RequestBody Bus bus){
        return busRepository.findAll();
    }
    @GetMapping("/acOrNonAc")
    public List<Bus> getAcOrNonAC(@RequestParam String acOrNonAc){
        return busRepository.getAcOrNonAC(acOrNonAc);
    }
}
