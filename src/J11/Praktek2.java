/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Praktek2 {
    private static void tampilJudul(String identitas) {
       System.out.println("Identitas: " + identitas);
       
       System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka) \n");
   }
         //BBBB
    public static void main(String[] args) {
       String identitas = "Nadila Amalia Pribadi / XRPL3 / 29";
       
       tampilJudul(identitas); 
       String kalimat = tampilInput();
    }
    
     private static String tampilInput() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = baca.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
}
