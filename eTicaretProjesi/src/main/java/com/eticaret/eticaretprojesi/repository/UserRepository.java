package com.eticaret.eticaretprojesi.repository;

import com.eticaret.eticaretprojesi.units.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);

}
