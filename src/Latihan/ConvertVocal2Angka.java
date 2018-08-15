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
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka) \n");
    }
    public static void main(String[] args) {
        String identitas = "Rizaldy Raditya Erwanto / X RPL 5 / 36";
        tampilJudul(identitas);
        String kalimat = tampilInput();
    }
    private static String tampilInput () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
}
