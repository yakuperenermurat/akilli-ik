package com.akilli.ik.controller;



import com.akilli.ik.business.abstracts.MusteriService;
import com.akilli.ik.dto.response.MusteriDTO;
import com.akilli.ik.dto.response.MusteriResponseDTO;
import com.akilli.ik.entity.Musteri;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/musteri")
public class MusteriController {

    private final MusteriService musteriService;

    public MusteriController(MusteriService musteriService) {
        this.musteriService = musteriService;
    }

    @PostMapping("/musteri-ekle")
    public ResponseEntity<MusteriResponseDTO> addMusteri(@RequestBody @Valid MusteriDTO musteriDTO) {
        Musteri musteri = new Musteri();
        musteri.setMusteriAdi(musteriDTO.getMusteriAdi());
        musteri.setMusteriSoyadi(musteriDTO.getMusteriSoyadi());
        musteri.setCinsiyet(musteriDTO.getCinsiyet());
        musteri.setDogumTarihi(musteriDTO.getDogumTarihi());
        musteri.setIl(musteriDTO.getIl());
        musteri.setAdres(musteriDTO.getAdres());
        musteri.setEngelliMi(musteriDTO.getEngelliMi());
        musteri.setCepTelefonu(musteriDTO.getCepTelefonu());
        musteri.setEPosta(musteriDTO.getEposta());

        musteriService.add(musteri);
        return ResponseEntity.ok(new MusteriResponseDTO(true, "Müşteri başarıyla eklendi."));
    }

    @GetMapping("/musteri-listesi")
    public ResponseEntity<List<Musteri>> getMusteriListesi() {
        return ResponseEntity.ok(musteriService.getAll());
    }
    @PostMapping("/hizmet-verilen-il-ekle")
    public ResponseEntity<MusteriResponseDTO> addIl(@RequestBody String il) {
        musteriService.addIl(il);
        return ResponseEntity.ok(new MusteriResponseDTO(true, "Hizmet verilen il başarıyla eklendi."));
    }

    @GetMapping("/hizmet-verilen-iller")
    public ResponseEntity<List<String>> getHizmetVerilenIller() {
        List<String> iller = musteriService.getDistinctIller();
        return ResponseEntity.ok(iller);
    }
    @PostMapping("/musteri-dogrula")
    public ResponseEntity<MusteriResponseDTO> verifyMusteri(@RequestBody @Valid MusteriDTO musteriDTO) {
        Musteri existingMusteri = musteriService.getByMusteriDetails(
                musteriDTO.getMusteriAdi(),
                musteriDTO.getMusteriSoyadi(),
                musteriDTO.getCepTelefonu()
        );

        if (existingMusteri != null) {
            return ResponseEntity.ok(new MusteriResponseDTO(true, "Müşteri başarıyla doğrulandı."));
        } else {
            return ResponseEntity.ok(new MusteriResponseDTO(false, "Müşteri doğrulanamadı."));
        }
    }
}

