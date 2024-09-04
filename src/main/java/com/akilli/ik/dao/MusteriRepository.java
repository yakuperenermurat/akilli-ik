package com.akilli.ik.dao;

import com.akilli.ik.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MusteriRepository extends JpaRepository<Musteri, Long> {
    Musteri findByMusteriAdiAndMusteriSoyadiAndCepTelefonu(String adi, String soyadi, String cepTelefonu);
}