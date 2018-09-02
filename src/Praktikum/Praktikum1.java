/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;


/**
 *
 * @author Rudi Erwanto
 */
public class Praktikum1 {
    public static String nama = " Rizaldy Raditya Erwanto ";
    
    public static void cetakNama(){
		System.out.println(nama);
    }
    public static void cetakKelas(String kelas){
		System.out.println(" SMK Telkom Malang Kelas "+kelas);
    }
    public static void main(String[] args){
		cetakNama();
		cetakKelas("X RPL 5");
	}
}
