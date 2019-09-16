package hu.elte.javaweb.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import hu.elte.javaweb.hotel.domain.Hotel;
import hu.elte.javaweb.hotel.service.HotelService;
import hu.elte.javaweb.hotel.view.HotelView;

@SpringBootApplication
public class HotelApplication {

	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HotelView hotelView;

	
	public void play() {
		hotelView.printWelcomeMessage();
		Hotel hotel1 = hotelService.findById(1);
		hotelView.printDetails(hotel1);
		
		Hotel hotel2 = hotelService.findById(2);
		hotelView.printDetails(hotel2);
		
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(HotelApplication.class, args);
		HotelApplication hotelApplication = context.getBean(HotelApplication.class);
		
		hotelApplication.play();
	}

}
