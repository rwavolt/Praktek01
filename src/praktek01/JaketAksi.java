/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ASUS
 */
public class JaketAksi {
    public static void main (String[] args) {
        Jaket Dropdead = new Jaket ();
        
        Dropdead.merek="Drop Dead";
        Dropdead.ukuran="L";
        Dropdead.warna="Kuning";
        Dropdead.bahan="Katun";
        Dropdead.harga=150000;
        
        Dropdead.cetakInfo();
    }
}
