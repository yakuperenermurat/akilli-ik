package com.akilli.ik.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "musteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 50)
    private String musteriAdi;

    @NotNull
    @Size(min = 2, max = 50)
    private String musteriSoyadi;

    @NotNull
    @Pattern(regexp = "K|E")
    private String cinsiyet;

    @NotNull
    private LocalDate dogumTarihi;

    private String il;

    @NotNull
    @Size(min = 10, max = 100)
    private String adres;

    @NotNull
    @Pattern(regexp = "H|E")
    private String engelliMi;

    @NotNull
    @Pattern(regexp = "^0[5][0-9]{2}[.\\-/ ]?[0-9]{3}[.\\-/ ]?[0-9]{4}$")
    private String cepTelefonu;

    @NotNull
    @Email
    private String ePosta;
}
