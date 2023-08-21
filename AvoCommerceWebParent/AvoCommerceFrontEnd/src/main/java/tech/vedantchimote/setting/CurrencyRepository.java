package tech.vedantchimote.setting;

import org.springframework.data.repository.CrudRepository;

import tech.vedantchimote.common.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
