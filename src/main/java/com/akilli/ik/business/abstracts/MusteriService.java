package com.akilli.ik.business.abstracts;

import com.akilli.ik.entity.Musteri;

import java.util.List;

public interface MusteriService {

    List<Musteri> getAll();

    Musteri getById(Long id);

    Musteri add(Musteri musteri);

    void addIl(String il);

    List<String> getDistinctIller();

    Musteri getByMusteriDetails(String adi, String soyadi, String cepTelefonu);
}