package tech.vedantchimote.shipping;

import org.springframework.data.repository.CrudRepository;

import tech.vedantchimote.common.entity.Country;
import tech.vedantchimote.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
