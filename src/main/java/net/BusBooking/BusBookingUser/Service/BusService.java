package net.BusBooking.BusBookingUser.Service;

import net.BusBooking.BusBookingUser.Entity.Bus;
import net.BusBooking.BusBookingUser.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusService {
    @Autowired
    BusRepository busRepository;

    public List<Bus> getBusBySrcAndDest(@RequestParam String source, @RequestParam String destination){
        List<Bus> busList = new ArrayList<>();
        busRepository.findAll().forEach(bus->{
            if(bus.getSource().equals(source) && bus.getDestination().equals(destination)) {
                busList.add(bus);
            }
        });
        return busList;
    }
    public List<Bus> getBusBySrcAndDestAtTime(@RequestParam String source,@RequestParam String destination,@RequestParam String time){
        List<Bus> busList = new ArrayList<>();
        busList =getBusBySrcAndDest(source, destination);
        return busList.stream().filter(bus ->
                bus.getTime().equals(time)).collect(Collectors.toList());

    }
    public List<Bus> filterBusByPriceSrcAndDestAtTime(@RequestParam String source,@RequestParam String destination,@RequestParam String time,@RequestParam String price){
       return busRepository.getBusBySrcAndDest(source,destination,time,price);
    }



}



