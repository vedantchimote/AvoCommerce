package tech.vedantchimote.admin.setting.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tech.vedantchimote.common.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}
