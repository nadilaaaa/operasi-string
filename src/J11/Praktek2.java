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
       String convert = vocal2Angka(kalimat);
    }
    
     private static String tampilInput() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = baca.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
     
     private static String vocal2Angka(String kalimat) {
        char [][] arConvert = {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i = 0; i<arConvert.length; i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
     }
}
