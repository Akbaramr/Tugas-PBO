/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Nama        : M. Akbar Amiruddin
NIM         : 13020220023
Hari/Tgl    : Rabu/27-03-2024
Pengerjaan  : 09.00 - 11.00
Materi      : Evaluasi Praktikum Modul 3
*/
package contohhashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ContohHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.print("Masukkan jumlah data yang ingin dimasukkan: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan key: ");
            String key = scanner.nextLine();

            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            hashMap.put(key, nilai);
        }

        System.out.println("\nHashMap setelah dimasukkan:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Nilai: " + hashMap.get(key));
        }
    }
}
