package hu.elte.javaweb.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hu.elte.javaweb.hotel.view.AdvancedHotelView;

@Configuration
public class HotelApplicationConfiguration {

	@Bean
	public AdvancedHotelView advancedHotelViewWithPlus() {
		return new AdvancedHotelView("++++++++++++++++++++++++");
	}
	
	@Bean
	public AdvancedHotelView advancedHotelViewWithMinus() {
		return new AdvancedHotelView("------------------------");
	}

}
