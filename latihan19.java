/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author ASUS
 */
public class latihan19 {
    public static void main(String[] args){
    Scanner inputan = new Scanner(System.in);
        int saldoAwal, bungaPerBulan, lamaBulan;
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoAwal = decimalFormat.format(saldoAwal);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + formattedsaldoAwal);
        }
    
    }
    
}
 
   

