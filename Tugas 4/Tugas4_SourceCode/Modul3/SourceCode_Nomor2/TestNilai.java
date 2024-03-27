/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Nama        : M. Akbar Amiruddin
NIM         : 13020220023
Hari/Tgl    : Rabu/27-03-2024
Pengerjaan  : 09.00 - 10.50
Materi      : Evaluasi Praktikum Modul 3
*/
package pertemuan2.modul3;

import java.util.Scanner;
public class TestNilai {

    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Jumlah Data : ");
                int banyakData = input.nextInt();
                int nilai[] = new int[banyakData];
                System.out.print("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.print("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : " + hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.print("Masukkan Jumlah Nilai Baru: ");
                int jumlahNilaiBaru = input.nextInt();
                hitung.inputNilaiBaru(jumlahNilaiBaru);
                System.out.print("Daftar Nilai Baru: ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}