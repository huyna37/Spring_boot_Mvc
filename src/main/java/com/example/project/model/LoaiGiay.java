package com.example.project.model;

import java.sql.Array;

public class LoaiGiay {
    private String MaLG;
    private String TenLG;
    public LoaiGiay(){

    }

    public LoaiGiay(String maLG, String tenLG) {
        MaLG = maLG;
        TenLG = tenLG;
    }

    public String getMaLG() {
        return MaLG;
    }

    public void setMaLG(String maLG) {
        MaLG = maLG;
    }

    public String getTenLG() {
        return TenLG;
    }

    public void setTenLG(String tenLG) {
        TenLG = tenLG;
    }
}
