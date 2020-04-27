/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;

/**
 *
 * @author ongky
 */
public class ClassPilihTeknisi {
    String kode, nama, alamat, telp;
    BufferedImage foto;

    public ClassPilihTeknisi(String kode, String nama, String alamat, String telp, BufferedImage foto) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.foto = foto;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public BufferedImage getFoto() {
        return foto;
    }

    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }

    
    
}
