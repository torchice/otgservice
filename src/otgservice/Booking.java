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
public class Booking {
    String kodebooking,namapemilik,namabarang,keterangan;
    String kodeteknisi;
    int statusbayar,statusselesai;

    public Booking(String kodebooking, String namapemilik, String namabarang, String keterangan, int statusbayar, int statusselesai) {
        this.kodebooking = kodebooking;
        this.namapemilik = namapemilik;
        this.namabarang = namabarang;
        this.keterangan = keterangan;
        this.statusbayar = statusbayar;
        this.statusselesai = statusselesai;
    }
    
    
}
