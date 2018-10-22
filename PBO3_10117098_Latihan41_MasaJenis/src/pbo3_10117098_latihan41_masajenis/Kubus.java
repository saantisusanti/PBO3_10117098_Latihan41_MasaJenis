/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan41_masajenis;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Mencari massa jenis dari variabel massa dan sisi kubus
 */
public class Kubus {
     private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int sisi) {

        return  sisi*sisi*sisi;}

    public int hitungMassaJenis(int massa, int volume) {
//        volume = hitungVolume(this.sisi);
//        massa = this.massa;
        return massa/volume;}
}
