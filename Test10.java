/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LP3I-PC-02
 */
import java.util.Scanner;

public class Test10{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Masuk,Keluar,Lama;

        System.out.println("Lama Bekerja");

        Masuk = scan.nextInt();
        System.out.println("Masukan Jumlah Masuk :    "+Masuk);

        Keluar = scan.nextInt();
        System.out.println("Masukan Jumlah Keluar :    "+Keluar);


        //cek total nilai belanja 
        if(Keluar >= Masuk) {
            Lama = Keluar - Masuk;
        }else{
            Lama = (12 - Masuk) + Keluar;
        }
        System.out.println("Lama =    "+Lama);
        scan.close();
    }
}
