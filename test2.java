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
public class test2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int masuk;
    int biaya;
    int keluar;
    int lama;
    
        System.out.print("jam masuk :"); 
        masuk = scan.nextInt();
        System.out.print("jam keluar");
        keluar = scan.nextInt();
        
        if (keluar >= 10) {
            lama = keluar - 10;
        }else {
            lama = (12 - 10)*keluar;
    }if (lama >2) {
        biaya = 2000 + ((lama - 2)*500);
    }else{
        biaya = 2000;
        
        System.out.print("Biaya parkir :"+biaya);
    }
            
        }
    
}
