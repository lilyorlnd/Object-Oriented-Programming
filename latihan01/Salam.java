/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

/**
 *
 * @author Sudi Astrini 
 * 2024/03/18
 * 
 * note:
 * void: tidak terlihat/tidak tertampil kalau belum dipanggil di halaman sebelumnya (latihan01)
 * ditambah public didepannya agar terihat publik
 * private : dia dipanggil dihalaamannya sendiri bukan di halaman pertama dengan memangil this.Tampil (gaperlu manggil di halaman pertama)
 */
public class Salam {
    public void cetak(){
        System.out.println("Data mahasiswa");
        System.out.println("Nama : komang Sudi Astrini");
        System.out.println("NIM : 2201010314");
        this.Tampil();
        
    }
    
    private void Tampil(){
        System.out.println("cetak teks dengan Method Tampil");
         System.out.println("================================ ");
        
    }
}
