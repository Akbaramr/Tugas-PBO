/*  NIM: 13020220023
    Nama: M. Akbar Amiruddin
    Hari/Tgl: Minggu/10-03-2024
    Waktu Pengerjaan : 14.15 - 15.50
*/

import java.util.Scanner;
/* Baca N, Print 1 s/d N dengan FOR */

public class PriFor {
/**
* @param args
*/

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    /* Kamus */
    int i,N;
    Scanner masukan=new Scanner(System.in);
    
    /* Program */
    
    /* program */
    System.out.print ("Baca N, print 1 s/d N ");
    System.out.print ("N = ");
    
    N=masukan.nextInt();
    for (i = 1; i <= N; i++){
    System.out.println (i); };
    System.out.println ("Akhir program \n");
    }
}