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
public class TambahData {
    
    // array list data    
    Scanner input = new Scanner(System.in);      
    void input(ArrayList<String> data){          
        System.out.println("Masukan data String : ");
        String x = input.nextLine();
        data.add(x);
        System.out.println("Daftar string dalam array list : " + data);       
                
    }
    
    
    
    
}
