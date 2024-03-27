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

public class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002134"; // stambuk anda
    }

    public Mahasiswa(String stb, String nama) {
        super(nama);
        this.stb = stb;
    }

    // Getter untuk mendapatkan nilai stb
    public String getStb() {
        return stb;
    }

    // Setter untuk mengatur nilai stb
    public void setStb(String stb) {
        this.stb = stb;
    }

    // Method info untuk mencetak nama dan stambuk
    public static void info() {
        System.out.println("Ini adalah info dari Class Mahasiswa");
    }
}
