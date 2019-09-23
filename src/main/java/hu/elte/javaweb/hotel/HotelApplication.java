package hu.elte.javaweb.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	@Qualifier("advancedHotelViewWithPlus")
	private HotelView hotelView;

	
	public void play() {
		hotelView.printWelcomeMessage();
		hotelService.createHotels();
		
		// find hotel by id
		Hotel hotelWithId3 = hotelService.findHotelById(3).get();
		hotelView.printDetails(hotelWithId3);
		
		// find hotel by name
		List<Hotel> hunguestHotelList = hotelService.findHotelByName("Hunguest Hotel");
		for (Hotel hotel : hunguestHotelList) {
			hotelView.printDetails(hotel);
		}
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(HotelApplication.class, args);
		
		HotelApplication hotelApplication = context.getBean(HotelApplication.class);

		HotelService hotelService = context.getBean(HotelService.class);
		HotelService hotelService2 = context.getBean(HotelService.class);
		System.out.println(hotelService);
		System.out.println(hotelService2);
		
		
		hotelApplication.play();
	}

}
