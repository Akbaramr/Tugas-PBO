/*  NIM: 13020220023
    Nama: M. Akbar Amiruddin
    Hari/Tgl: Senin/04-03-2024
    Waktu Pengerjaan : 21.00 - 23.00
*/
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();
        int detikSekarang = totalDetik % 60;
        int totalMenit = totalDetik / 60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

       
        System.out.println("Waktu sekarang: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        scanner.close();
    }
}

