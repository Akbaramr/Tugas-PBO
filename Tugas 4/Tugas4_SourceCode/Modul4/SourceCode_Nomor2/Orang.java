/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Nama        : M. Akbar Amiruddin
NIM         : 13020220023
Hari/Tgl    : Rabu/27-03-2024
Pengerjaan  : 09.00 - 10.50
Materi      : Evaluasi Praktikum Modul 4
*/

package pertemuan2.modul4.userr;

public class Orang {
    protected String nama;

    public Orang() {
        this.nama = "Aminah";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari Class Orang");
    }
}

