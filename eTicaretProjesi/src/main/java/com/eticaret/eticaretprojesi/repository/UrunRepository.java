package com.eticaret.eticaretprojesi.repository;

import com.eticaret.eticaretprojesi.units.UrunUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<UrunUnit, Long> {

    List<UrunUnit> findAll();
}
