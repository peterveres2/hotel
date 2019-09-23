package hu.elte.javaweb.hotel;

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
		Hotel hotel1 = hotelService.findById(1);
		hotelView.printDetails(hotel1);
		
		Hotel hotel2 = hotelService.findById(2);
		hotelView.printDetails(hotel2);
		
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
