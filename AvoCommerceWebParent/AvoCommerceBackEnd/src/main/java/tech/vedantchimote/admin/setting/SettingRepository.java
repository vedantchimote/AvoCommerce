package tech.vedantchimote.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tech.vedantchimote.common.entity.setting.Setting;
import tech.vedantchimote.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
