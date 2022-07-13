package net.BusBooking.BusBookingUser.Repository;

import net.BusBooking.BusBookingUser.Entity.Bus;
import net.BusBooking.BusBookingUser.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.List;


@Repository
public interface BusRepository extends JpaRepository<Bus,Long> {
  //@Autowired

  //@Query("SELECT c FROM Bus c WHERE c.source LIKE %:source% OR c.destination LIKE %:destination% OR c.time LIKE %:time% OR c.price LIKE %:price% ")
  //List<Bus> getBusDetails(String source, String destination, String time, String price);
  @Query("SELECT c FROM Bus c WHERE c.source LIKE %:source% AND c.destination LIKE %:destination% AND c.time LIKE %:time% AND c.price LIKE %:price% ")
  List<Bus> getBusBySrcAndDest(@RequestParam String source, @RequestParam String destination,@RequestParam String time,@RequestParam String price);
  @Query("SELECT c FROM Bus c WHERE c.acOrNonAc =:acOrNonAc")
  List<Bus> getAcOrNonAC(@RequestParam String acOrNonAc);
}
