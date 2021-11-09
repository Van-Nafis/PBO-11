/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class HapusData {
    Scanner input = new Scanner(System.in);    
    
    void hapus(ArrayList<String> data){
        ArrayList<String> dataX = new ArrayList<String>();
        
        System.out.println("String yang mau dihapus : ");
        String x = input.nextLine();
        
        for (String i : data){
            dataX.add(i);
        }
        
        if (dataX.indexOf(x)==-1){            
            System.out.println("String "+x+" tidak ada dalam data");
        }else{
            data.remove(x);
            System.out.println("String "+x+" sudah dihapus dalam data");
        }
        
        System.out.println("Daftar string dalam array list : " + data);
    }
    
}
