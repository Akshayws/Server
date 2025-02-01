package com.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Api.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);

	
}
