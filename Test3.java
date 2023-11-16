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

public class Test3{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Peserta;
        int Minibus;
        System.out.println("Jumlah Minibus berdasarkan Jumlah peserta");

        Peserta = scan.nextInt();
        System.out.println("Masukan Jumlah Peserta : "+Peserta);

        Minibus = 0;

        if(Peserta > 7) {
            Minibus = Peserta / 7;
            if (Peserta % 7 != 0){
                Minibus = Minibus + 1;
            }
        }else if(Peserta > 0){
            Minibus = 1;
        }else{
            System.out.println("Tidak dapat Minibus");
        }
        System.out.println("Minibus =    "+Minibus);
        scan.close();
    }
}
