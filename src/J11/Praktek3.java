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
public class Praktek3 {
    public static void main(String[] args) {
     String identitas = "Nadila Amalia Pribadi / 29 / XRPL3";
    
     Scanner baca = new Scanner(System.in);
        String[] buku = new String[] {"The Davinci Code", "Harry Potter", "The Lord Of The Rings", "13 Reasons Why", 
            "3600 Detik", "Bulan", "Bintang", "Matahari"};
        
        System.out.print("Masukkan Judul Buku: ");
        String cari = baca.nextLine();   
        int x = 0;
        
        
        
        for(int i = 0; i < 8; i++)
        {
            if(cari.equalsIgnoreCase(buku[i]))
            {
                x = 1;
            }
        }
        
        if(x == 1)
        {
            System.out.println("Stock Buku Tersedia");
        }
        else
        {
            System.out.println("Stock Buku Tidak Tersedia");
        }
        
        System.out.println("");
        
        System.out.println("Apakah Anda ingin memesan buku yang tidak tersedia? [ya/tidak]");
        
        String jawab = baca.nextLine();
        
        if(jawab.equals("ya"))
        {
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=========Untuk buku yang stocknya tidak tersedia, dapat dipesan disini=========");
        System.out.print("Judul Buku Yang Mau Dipesan: ");
        
        String pesan;
        pesan = baca.nextLine();
        if(pesan.isEmpty() == true)
        {
            System.out.println("Belum ada judul yang dimasukkan, masukkan lagi: ");
        }
        
        else
        {     
        String info = "bagi buku yang sudah dipesan akan tersedia 1 bulan lagi"; 
        System.out.println("Info: " + info.toUpperCase());
        } 
        }
        else
        {
            System.out.println(":)");
        }
               
    }
}
