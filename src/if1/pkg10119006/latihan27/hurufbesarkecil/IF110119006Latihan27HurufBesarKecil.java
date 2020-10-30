/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Mengganti Huruf besar dan kecil
 */
public class IF110119006Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String kalimat, besar, kecil;
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = userInput.nextLine();
        System.out.println();
        
        besar = kalimat.toUpperCase();
        kecil = kalimat.toLowerCase();
        
        System.out.println("======Hasil Formating=====");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf Kecil : " + kecil);
    }
    
}
