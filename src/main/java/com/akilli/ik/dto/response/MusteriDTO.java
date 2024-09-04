package com.akilli.ik.dto.response;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class MusteriDTO {
    @NotNull(message = "Müşteri adı boş olamaz")
    private String musteriAdi;

    @NotNull(message = "Müşteri soyadı boş olamaz")
    private String musteriSoyadi;

    @NotNull(message = "Cinsiyet boş olamaz")
    private String cinsiyet;

    @NotNull(message = "Doğum tarihi boş olamaz")
    private LocalDate dogumTarihi;

    @NotNull(message = "İl boş olamaz")
    private String il;

    @NotNull(message = "Adres boş olamaz")
    private String adres;

    @NotNull(message = "Engellilik durumu boş olamaz")
    private String engelliMi;

    @NotNull(message = "Cep telefonu boş olamaz")
    private String cepTelefonu;

    @Email(message = "Geçersiz e-posta formatı")
    private String eposta;
}