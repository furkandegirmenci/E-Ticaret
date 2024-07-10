package com.eticaret.eticaretprojesi.controller;

import com.eticaret.eticaretprojesi.service.UrunService;
import com.eticaret.eticaretprojesi.units.UrunUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urunler")
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    @PostMapping
    public String addUrunToShop(@RequestParam String isim, @RequestParam String kategori, @RequestParam Float fiyat, @RequestParam int stok) {
        urunService.addUrunToList(isim, kategori, fiyat, stok);
        return "Urun eklendi";

    }

    @GetMapping
    public List<UrunUnit> urunleriGoster() {
        return urunService.getUrun();
    }
}
