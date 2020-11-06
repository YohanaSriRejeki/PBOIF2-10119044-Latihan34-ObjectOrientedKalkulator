/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan34.objectorientedkalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan program kalkulator
 * yang berbasis object oriented 
 */
public class PBOIF210119044Latihan34ObjectOrientedKalkulator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Kalkulator kalku = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalku.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalku.value2 = input.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan : "+kalku.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalku.kurangBilangan());
        System.out.println("Hasil Pembagian   : "+kalku.bagiBilangan());
        System.out.println("Hasil Sisa        : "+kalku.sisaBilangan());
    }
    
}
