/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.awt.Image;

/**
 *
 * @author Andy
 */
public class Teknisi {
    String kodeteknisi,nama,notelp,alamat,kota;
    Image FotoPribadi,TandaPengenal;
    String username,password;

    public Teknisi(String kodeteknisi, String nama, String notelp, String alamat, String kota, Image FotoPribadi, Image TandaPengenal, String username, String password) {
        this.kodeteknisi = kodeteknisi;
        this.nama = nama;
        this.notelp = notelp;
        this.alamat = alamat;
        this.kota = kota;
        this.FotoPribadi = FotoPribadi;
        this.TandaPengenal = TandaPengenal;
        this.username = username;
        this.password = password;
    }
        
    public String getKodeteknisi() {
        return kodeteknisi;
    }

    public void setKodeteknisi(String kodeteknisi) {
        this.kodeteknisi = kodeteknisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Image getFotoPribadi() {
        return FotoPribadi;
    }

    public void setFotoPribadi(Image FotoPribadi) {
        this.FotoPribadi = FotoPribadi;
    }

    public Image getTandaPengenal() {
        return TandaPengenal;
    }

    public void setTandaPengenal(Image TandaPengenal) {
        this.TandaPengenal = TandaPengenal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

   

 

  
    
}
