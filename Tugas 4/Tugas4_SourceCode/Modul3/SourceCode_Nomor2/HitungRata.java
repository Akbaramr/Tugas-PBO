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

import java.util.*;

public class HitungRata {
    private double total = 0.0;
    private ArrayList nilaiBaru = new ArrayList();
    Scanner input = new Scanner(System.in);
 
    public void inputNilai(int nilai[]) {
        int i = 0;
        while (i < nilai.length) {
            nilai[i] = input.nextInt();
            total += nilai[i];
            i++;
        }
    }
    public double rataNilai(int Ndata) {
    return total / ((double) Ndata);
    }
    
    public void cetakNilai(int nilai[]) {
        for (int angka : nilai) {
            System.out.print(angka +"\t");
        }
        System.out.println();
    }
    
    public void inputNilaiBaru(int jumlah) {
    
        while (jumlah > 0) {
            nilaiBaru.add(input.nextInt());
            jumlah--;
        }
    }
    public void cetakNilaiBaru() {
        ListIterator i = nilaiBaru.listIterator(0);
        while (i.hasNext()) {
            Object data = i.next();
            if (data == null) {
                System.out.println("null");
            } else {
                System.out.println(data.toString());
            }
        }
    }
}


