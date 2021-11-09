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
public class CariData {
    Scanner input = new Scanner(System.in);
    
    void cari(ArrayList<String> data){
        
        ArrayList<String> dataX = new ArrayList<String>();
        
        System.out.println("String yang mau dicari : ");
        String z = input.nextLine();        
        
        for (String i : data){
            dataX.add(i);                        
        }
        
        if(dataX.indexOf(z)==-1){
            System.out.println("String "+z+" tidak ada dalam data");
        }else{
            System.out.println("String "+z+" ada di index ke-"+ dataX.indexOf(z) +" di dalam data" );
        }
        
        
            
        
        
        
        
    
                           
    }
        
}
