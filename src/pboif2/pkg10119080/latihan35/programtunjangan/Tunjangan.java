/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Program Tunjangan
 */
class Tunjangan {
    public static String status;
    public static Double gaji, tunjangan;
    
    public static void inputData() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = scanner.nextDouble();
        
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = scanner.next();
        while (!(status.toUpperCase().equals("MENIKAH") || status.toUpperCase().
                 equals("BELUM"))) {
            System.out.print("Status Anda?(Menikah/Belum)\t: ");
                status = scanner.next();
        }
    }
    
    public static void cekStatus() {
        tunjangan = (status.toUpperCase().equals("MENIKAH")) ? 
                     hitungTunjangan(gaji):0.0;
    }
    
    public static double hitungTunjangan(double gaji) {
        double hitungTunjangan = 0.35 * gaji;
        return hitungTunjangan;
    }
    
    public static void tampilFormat() {
        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.printf("Tunjangan\t\t: Rp. %.1f%n", tunjangan);
        double totalGaji = gaji + tunjangan;
        System.out.println("Total Gaji\t\t: Rp. " + totalGaji);
        System.out.println("(Developed by : Kevin Pratama Sinaga)");
    }
    
}