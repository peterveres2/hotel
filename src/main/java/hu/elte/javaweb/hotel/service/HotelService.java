package hu.elte.javaweb.hotel.service;

import hu.elte.javaweb.hotel.domain.Hotel;

public class HotelService {

	public Hotel findById(int id) {
		Hotel hotel = new Hotel();
		hotel.setId(id);
		if (id == 1) {
			hotel.setName("Mariott ***** Superior");
			hotel.setCapacity(500);
		}
		else if (id == 2) {
			hotel.setName("Intercontinental ***** Superior");
			hotel.setCapacity(1500);			
		}
		else {
			throw new IllegalArgumentException("Hotel does not [" + id + "] exist.");
		}
		return hotel;
	}
}
