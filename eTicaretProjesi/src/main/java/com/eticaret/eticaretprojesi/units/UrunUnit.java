package com.eticaret.eticaretprojesi.units;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UrunUnit {
    @Id
    @GeneratedValue
    private Long id;

    private String urunAdi;
    private String urunKategorisi;
    private Float urunFiyati;
    private int stok;
}
