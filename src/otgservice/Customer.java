/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

/**
 *
 * @author Andy
 */
public class Customer {
    String kodecust,namacust,alamat,kota,telepon;
    String username,password;
    
    public Customer(String kodecust, String namacust, String alamat, String kota, String telepon, String username, String password) {
        this.kodecust = kodecust;
        this.namacust = namacust;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
        this.username = username;
        this.password = password;
    }

    public String getKodecust() {
        return kodecust;
    }

    public void setKodecust(String kodecust) {
        this.kodecust = kodecust;
    }

    public String getNamacust() {
        return namacust;
    }

    public void setNamacust(String namacust) {
        this.namacust = namacust;
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

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
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
