/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class Tugas {
     private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
    }
     public static void main(String[] args) {
         String identitas = "Rizaldy Raditya Erwanto / X RPL 5 / 36";
        tampilJudul(identitas);
        String kalimat = tampilAsalSekolah();
       String  print = printAsalKota();
       String cetak = cetakAlasan();
     }
      private static String tampilAsalSekolah () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Asal Sekolah : ");
        String kalimat = scanner.nextLine();
        
        return kalimat;
      }
       private static String printAsalKota () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Asal Kota : ");
        String kalimat = scanner.nextLine();
        
        return kalimat;
       }
        private static String cetakAlasan () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Alasan Masuk SMK Telkom : ");
        String kalimat = scanner.nextLine();
        
        return kalimat;
        }
}
