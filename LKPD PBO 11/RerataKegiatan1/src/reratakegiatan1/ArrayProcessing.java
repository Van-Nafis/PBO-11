/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reratakegiatan1;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Acer
 */
public class ArrayProcessing {
    
    // array of integer -> data
    int[] dataBil = new int[100];    
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan banyaknya data (n) : ");
        n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukan bil ke-"+(i+1)+": ");
            dataBil[i] = input.nextInt();
        }
    
    } 
       
    int cariMax(int[] data){
        int max = dataBil[0];
        for (int i=1; i<n; i++){
            if (dataBil[i] > max){
                max = dataBil[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] data){
        int min = dataBil[0];
        for (int i=1; i<n; i++){
            if (dataBil[i]<min){
                min = dataBil[i];
            }
        }
        return min;
    }   
            
    int[] urutkan(int[] data){
        boolean swap = true;
        int temp;
        
        while(swap){
            swap = false;
            
            for(int i=0; i<n-1; i++){
                if(data[i]>data[i+1]){
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    swap = true;
                }else if(data[i]==0){
                    break;
                }
            }
        }
        return data;
    }    
  
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += data[i];
        }
        double rerata = sum/n;
        return rerata;
    }
    
    void output(){        
        System.out.println("Rerata : " + hitungRerata(dataBil));
        System.out.println("Nilai Max  : " + cariMax(dataBil));
        System.out.println("Nilai Min  : " + cariMin(dataBil));
        System.out.println("Hasil sort : " + Arrays.toString(urutkan(dataBil)));        
    }
}
