package com.eticaret.eticaretprojesi.service;

import com.eticaret.eticaretprojesi.repository.UrunRepository;
import com.eticaret.eticaretprojesi.units.UrunUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunService {

    private final UrunRepository urunRepository;

    public void addUrunToList(String isim, String kategori, Float fiyat, int stok) {
        UrunUnit yeniUrun = new UrunUnit();
        yeniUrun.setUrunFiyati(fiyat);
        yeniUrun.setUrunAdi(isim);
        yeniUrun.setUrunKategorisi(kategori);
        yeniUrun.setStok(stok);

        urunRepository.save(yeniUrun);
    }

    public List<UrunUnit> getUrun() {
        return urunRepository.findAll();
    }
}
