package hu.elte.javaweb.hotel.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import hu.elte.javaweb.hotel.domain.Hotel;

@Component
public class AdvancedHotelView implements HotelView {

	@Value("${application-name}")
	private String appName;
	
	public void printDetails(Hotel hotel) {
		System.out.println("******************************");
		System.out.println("Hotel details:");
		System.out.printf("Id: %s %n", hotel.getId());
		System.out.printf("Name: %s %n", hotel.getName());
		System.out.printf("Capacity: %s %n", hotel.getCapacity());
		System.out.println("******************************");
		
	}
	
	public void printWelcomeMessage() {
		System.out.printf("Welcome %s%n", appName);
	}
}
