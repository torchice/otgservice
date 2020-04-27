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
public class barangDagang {
    String kodebrg,nama;
    int stok;
    int hargapcs;
    int hargatotal;

    public barangDagang(String kodebrg, String nama, int hargapcs,int stok,int hargatotal) {
        this.kodebrg = kodebrg;
        this.nama = nama;
        this.stok=stok;
        this.hargapcs = hargapcs;
        this.hargatotal=hargatotal;
    }

    public String getKodebrg() {
        return kodebrg;
    }

    public void setKodebrg(String kodebrg) {
        this.kodebrg = kodebrg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargapcs() {
        return hargapcs;
    }

   

    public int getHargatotal() {
        return hargatotal;
    }

    public void setHargatotal(int hargatotal) {
        this.hargatotal = hargatotal;
    }

 
    
}
