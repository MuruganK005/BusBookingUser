package net.BusBooking.BusBookingUser.Entity;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.sql.Time;
@Getter
@Setter
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    @Column(name = "NumberOfSeat")
    private Long numOfSeat;
    @Column(name = "Source")
    private String source;
    @Column(name = "Destination")
    private String destination;
    @Column(name = "Time")
    private String time;
    @Column(name = "BusType")
    private String busType;
    @Column(name = "Price")
    private String price;
    @Column(name = "AcOrNonAc")
    private String acOrNonAc;


}
