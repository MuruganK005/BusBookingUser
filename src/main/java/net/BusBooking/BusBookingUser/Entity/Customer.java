package net.BusBooking.BusBookingUser.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(name = "CustomerName")
    private String customerName;
    @Column(name = "CustomerNumber")
    private String customerNumber;
}
