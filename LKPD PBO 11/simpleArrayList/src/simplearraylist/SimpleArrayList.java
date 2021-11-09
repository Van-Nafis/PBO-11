/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<String> dataStr = new ArrayList<String>();
        
        while(true){
            System.out.println("----------------------");
            System.out.println("Menu Data ArrayList : ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("Pilih nomor berapa : ");
            int x = input.nextInt();
            
            switch(x){
                case(1):
                    TambahData td = new TambahData();
                    td.input(dataStr);                    
                    break;
                    
                case(2):
                    CariData cd = new CariData();
                    cd.cari(dataStr);                    
                    break;
                    
                case(3):
                    HapusData hd = new HapusData();
                    hd.hapus(dataStr);
                    break;
                    
                case(4):
                    TampilData tam = new TampilData();
                    tam.tampil(dataStr);
                    break;
                    
                case (5):
                    System.out.println("Terimakasih");
                    System.exit(0);
                    
                default:
                    System.out.println("Menu data yang anda input salah. Selahkan coba lagi");
            }
            
            
                       
        }
        
        
    }
}
        

