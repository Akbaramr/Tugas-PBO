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

public class Utama {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "ALI"; // isi sesuai nama anda
        System.out.println("Stb : " + orang.nama);

        // Memanggil method info() dari Class Orang
        Orang.info();

        // Menambahkan objek mhs1 dengan konstruktor default Mahasiswa()
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("Stambuk Mahasiswa: " + mhs1.getStb());

        // Memanggil method info() dari Class Mahasiswa
        Mahasiswa.info();
    }
}
