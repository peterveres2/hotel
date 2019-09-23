package hu.elte.javaweb.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import hu.elte.javaweb.hotel.domain.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {

}
