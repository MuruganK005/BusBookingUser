package net.BusBooking.BusBookingUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BusBookingUserApplication {

	public static void main(String[] args) {

		SpringApplication.run(BusBookingUserApplication.class, args);
	}

}
