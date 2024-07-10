package com.eticaret.eticaretprojesi.repository;

import com.eticaret.eticaretprojesi.units.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);
}
