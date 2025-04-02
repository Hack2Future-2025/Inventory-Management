package com.hack2future.invmanage.repository;

import java.util.Optional;

import com.hack2future.invmanage.constants.RoleEnum;
import com.hack2future.invmanage.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByRoleName(String roleName);
}
