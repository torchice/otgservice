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
public class Transaksi {
    String kodetrans;
    Double totalharga,totalkeuntungan,diskon,tax;

    public Transaksi(String kodetrans, Double totalharga, Double totalkeuntungan, Double diskon, Double tax) {
        this.kodetrans = kodetrans;
        this.totalharga = totalharga;
        this.totalkeuntungan = totalkeuntungan;
        this.diskon = diskon;
        this.tax = tax;
    }
    
    
}
