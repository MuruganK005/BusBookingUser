package net.BusBooking.BusBookingUser.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;
    @Column(name = "DriverName")
    private String driverName;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("driver")
    @JoinColumn(name="bus_id")
    private Bus bus;
    @Column(name = "DriverPhoneNunber")
    private String phoneNumber;



}
