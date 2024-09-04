package com.akilli.ik.dto.response;

import lombok.Data;

@Data
public class MusteriResponseDTO {
    private boolean status;
    private String mesaj;

    public MusteriResponseDTO(boolean status, String mesaj) {
        this.status = status;
        this.mesaj = mesaj;
    }
}
