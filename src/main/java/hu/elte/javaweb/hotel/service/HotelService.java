package hu.elte.javaweb.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.elte.javaweb.hotel.domain.Hotel;
import hu.elte.javaweb.hotel.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	public void createHotels() {
		Hotel marriot = new Hotel();
		marriot.setId(1);
		marriot.setName("Marriot Hotel");
		marriot.setCapacity(500);
		hotelRepository.save(marriot);
		
		Hotel intercontinental = new Hotel();
		intercontinental.setId(2);
		intercontinental.setName("Intercontinental Hotel");
		intercontinental.setCapacity(1500);
		hotelRepository.save(intercontinental);
		
		Hotel botelHotelMotel = new Hotel();
		botelHotelMotel.setId(3);
		botelHotelMotel.setName("Hunguest Hotel Mátrafüred");
		botelHotelMotel.setCapacity(500);
		hotelRepository.save(botelHotelMotel);
		
		Hotel hunguest = new Hotel();
		hunguest.setId(4);
		hunguest.setName("Hunguest Hotel Sopron");
		hunguest.setCapacity(1500);
		hotelRepository.save(hunguest);
	}
	
	public void destroyHotels() {
		hotelRepository.deleteAll();
	}
	
	public Optional<Hotel> findHotelById(int id) {
		return hotelRepository.findById(id);
	}
	
	public List<Hotel> findHotelByName(String name){
		return hotelRepository.findByNameContaining(name);
	}
}
