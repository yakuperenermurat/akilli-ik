package com.akilli.ik.business.concretes;

import com.akilli.ik.business.abstracts.MusteriService;
import com.akilli.ik.dao.IlRepository;
import com.akilli.ik.entity.Il;
import com.akilli.ik.entity.Musteri;
import com.akilli.ik.dao.MusteriRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MusteriManager implements MusteriService {

    private final MusteriRepository musteriRepository;
    private final IlRepository ilRepository;

    public MusteriManager(MusteriRepository musteriRepository, IlRepository ilRepository) {
        this.musteriRepository = musteriRepository;
        this.ilRepository = ilRepository;
    }

    @Override
    public List<Musteri> getAll() {
        return musteriRepository.findAll();
    }

    @Override
    public Musteri getById(Long id) {
        Optional<Musteri> musteri = musteriRepository.findById(id);
        return musteri.orElse(null);
    }

    @Override
    public Musteri add(Musteri musteri) {
        return musteriRepository.save(musteri);
    }

    @Override
    public void addIl(String il) {
        Il yeniIl = new Il();
        yeniIl.setIlAdi(il);
        ilRepository.save(yeniIl);
    }

    @Override
    public List<String> getDistinctIller() {
        return ilRepository.findAll().stream()
                .map(Il::getIlAdi)
                .collect(Collectors.toList());
    }

    @Override
    public Musteri getByMusteriDetails(String adi, String soyadi, String cepTelefonu) {
        return musteriRepository.findByMusteriAdiAndMusteriSoyadiAndCepTelefonu(adi, soyadi, cepTelefonu);
    }

}