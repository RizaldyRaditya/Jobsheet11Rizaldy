package Latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudi Erwanto
 */
public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "Rizaldy Raditya Erwamto / X RPL 5 / 36";
        System.out.println("identitas : "+ identitas);
        
        String x = " Operasi";
        System.out.println("isi variabel x : "+ x);
        System.out.println("\""+ x +"\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
    }
}
