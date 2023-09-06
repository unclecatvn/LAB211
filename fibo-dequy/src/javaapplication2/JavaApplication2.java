/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author HoaiNam
 */
public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    public static int fibonancci(int i){
        if(i<2) return i;
        return fibonancci(i-1) + fibonancci(i-2);
    }
    
    
    
    public static void main(String[] args) {
        System.out.print("Input n:");
        int n = Integer.parseInt(sc.nextLine());
        
        
        System.out.print("The sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonancci(i) + ", ");
            
              
        }
//        System.out.println(fibonancci(10));
    }
    
}
