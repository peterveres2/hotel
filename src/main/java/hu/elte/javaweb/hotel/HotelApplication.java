package hu.elte.javaweb.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.elte.javaweb.hotel.domain.Hotel;
import hu.elte.javaweb.hotel.service.HotelService;
import hu.elte.javaweb.hotel.view.HotelView;

@SpringBootApplication
public class HotelApplication {

	private HotelService hotelService;
	private HotelView hotelView;
	
	public HotelApplication() {
		hotelService = new HotelService();
		hotelView = new HotelView();
	}
	
	public void play() {
		Hotel hotel1 = hotelService.findById(1);
		hotelView.printDetails(hotel1);
		
		Hotel hotel2 = hotelService.findById(2);
		hotelView.printDetails(hotel2);
		
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(HotelApplication.class, args);
		HotelApplication hotelApplication = new HotelApplication();
		hotelApplication.play();
	}

}
