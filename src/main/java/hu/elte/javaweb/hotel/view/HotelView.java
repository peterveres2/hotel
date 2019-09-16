package hu.elte.javaweb.hotel.view;

import hu.elte.javaweb.hotel.domain.Hotel;

public interface HotelView {
	void printDetails(Hotel hotel);
	void printWelcomeMessage();
	
}
