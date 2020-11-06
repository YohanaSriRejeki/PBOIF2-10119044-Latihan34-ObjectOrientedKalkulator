/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan34.objectorientedkalkulator;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan program kalkulator
 * yang berbasis object oriented 
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan() {
        double tambah; 
        tambah = value1+value2;
        return tambah;
    }

    public double kurangBilangan() {
        double kurang; 
        kurang = value1-value2;
        return kurang;
    }

    public double kaliBilangan() {
        double kali; 
        kali = value1*value2;
        return kali;
    }
    
    public double bagiBilangan() {
        double bagi; 
        bagi = value1 / value2;
        return bagi;
    }

    public double sisaBilangan() {
        double sisa; 
        sisa = value1%value2;
        return sisa;
    }
}
