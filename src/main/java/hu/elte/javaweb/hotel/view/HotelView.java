package hu.elte.javaweb.hotel.view;

import org.springframework.stereotype.Component;

import hu.elte.javaweb.hotel.domain.Hotel;

@Component
public class HotelView {

	public void printDetails(Hotel hotel) {
		System.out.println("Hotel details:");
		System.out.printf("Id: %s %n", hotel.getId());
		System.out.printf("Name: %s %n", hotel.getName());
		System.out.printf("Capacity: %s %n", hotel.getCapacity());
		
	}
}
