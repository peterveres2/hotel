package hu.elte.javaweb.hotel.view;

import org.springframework.beans.factory.annotation.Value;

import hu.elte.javaweb.hotel.domain.Hotel;

public class AdvancedHotelView implements HotelView {

	@Value("${application-name}")
	private String appName;
	
	private final String border;
	
	
	
	public AdvancedHotelView(String border) {
		super();
		this.border = border;
	}

	public void printDetails(Hotel hotel) {
		System.out.println(border);
		System.out.println("Hotel details:");
		System.out.printf("Id: %s %n", hotel.getId());
		System.out.printf("Name: %s %n", hotel.getName());
		System.out.printf("Capacity: %s %n", hotel.getCapacity());
		System.out.println(border);
		
	}
	
	public void printWelcomeMessage() {
		System.out.printf("Welcome %s%n", appName);
	}
}
