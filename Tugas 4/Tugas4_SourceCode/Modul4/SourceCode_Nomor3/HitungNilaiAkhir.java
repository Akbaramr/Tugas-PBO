/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Nama        : M. Akbar Amiruddin
NIM         : 13020220023
Hari/Tgl    : Rabu/27-03-2024
Pengerjaan  : 09.00 - 11.00
Materi      : Evaluasi Praktikum Modul 4
*/
package Evaluasi.HitungNilai;

public class HitungNilaiAkhir{
    public double nilaiTugas(int tugas1, int tugas2){ 
        double rataTugas = (tugas1 + tugas2) / 2.0;
        return rataTugas;
    }

    public double nilaiAkhir(double tugas, int mid, int uas){
        double nilaiAkhir = (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
        return nilaiAkhir;
    }
} 

