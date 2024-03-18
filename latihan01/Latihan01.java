/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan01;

/**
 *
 * @author Sudi Astrini
 * Pertemuan 1
 * tgl : 2024-04-18
 * 
 * note :
 * down : variabel bebas dipakai misal pakai I ataupun S seperti sebelumnya
 * 
 * java : private, protected, public
 * private : dia dipanggil dihalaamannya sendiri bukan di halaman pertama 
 */
public class Latihan01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Selamat Datang ");
        System.out.println("Di Mata Kuliah Object Oriented Programming, Sudi ");

        
        Salam S = new Salam();
        S.cetak();
        
        
        Intro down = new Intro();
        down.cetak();
    }
    
}
