package tech.vedantchimote.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tech.vedantchimote.common.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
