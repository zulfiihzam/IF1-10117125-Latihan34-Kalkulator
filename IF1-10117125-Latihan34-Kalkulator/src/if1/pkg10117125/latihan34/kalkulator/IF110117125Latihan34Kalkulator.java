/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author
 * Nama : Zulfi Ihzam Rahmat
 * Kelas: IF-1
 * NIM  : 10117125
 * Deskripsi Program : program ini berisi program menampilkan aplikasi 
 * kalkulator penjumlahan, pengurangan, perkalian, pembagian dan mod.
 */
public class IF110117125Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
        kalkulator myKalkulator = new kalkulator();
        
        System.out.println("=== Aplikasi Kalkulator Bilangan ===");
        System.out.print("Masukkan Angka ke-1 : ");
        myKalkulator.value1 = scanner.nextDouble();
                
        System.out.print("Masukkan Angka ke-2 : ");
        myKalkulator.value2 = scanner.nextDouble();
        
        System.out.print("");
        
        System.out.println("Hasil Pertambahan : " + 
                myKalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + 
                myKalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + 
                myKalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + 
                myKalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + 
                myKalkulator.sisaBilangan());
    }
    
}
