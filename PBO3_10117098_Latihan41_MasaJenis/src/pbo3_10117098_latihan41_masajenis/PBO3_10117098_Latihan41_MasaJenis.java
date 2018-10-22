/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan41_masajenis;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Mencari massa jenis dari variabel massa dan sisi kubus
 */
public class PBO3_10117098_Latihan41_MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Kubus kubus = new Kubus();

        System.out.println("===Massa Janes Kubus===");
        System.out.print("Sisi \t: ");
        kubus.setSisi(scn1.nextInt());
        System.out.print("Massa \t: ");
        kubus.setMassa(scn1.nextInt());

        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("Volume      : "+kubus.hitungVolume
        (kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis
        (kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
    
}
