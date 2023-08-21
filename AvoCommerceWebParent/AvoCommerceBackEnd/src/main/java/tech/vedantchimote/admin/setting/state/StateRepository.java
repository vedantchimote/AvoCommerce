package tech.vedantchimote.admin.setting.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tech.vedantchimote.common.entity.Country;
import tech.vedantchimote.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
