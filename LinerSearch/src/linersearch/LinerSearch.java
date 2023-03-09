/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linersearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LinerSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter number of array:");
        int num = validate("Enter number of array:", 0);
        int k = 0;
        int []arr = input(num);
        System.out.println("Enter the number you need to search:");
        int u = validate("Enter the number you need to search:", -1);
        display(arr);
        System.out.println("");
        int s = LinearSearch(arr, u);
        if(s>-1){
            System.out.println("The number locate at: ");
            System.out.println(s);
        }else{
            System.out.println("can't find the number");
        }
    }
    public static int LinearSearch(int [] arr, int u) {
        int k = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == u){
                k = 1;
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void display(int [] arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
            if(i<arr.length-1){
                System.out.print(", ");
            }else{
                
            }
        }
    }
    
    public static int validate(String msg, int min){
        Scanner sc = new Scanner(System.in);
        int k;
        while(true){
            try{
                k = Integer.parseInt(sc.nextLine());
                if(k<=min){
                    throw new Exception();
                }else{
                    return k;}
                }catch(Exception e){
                    System.out.println("Please re-enter:");
                    System.out.println(msg);
                }
            }
        }
    public static int[] input(int num) {
        Random rd = new Random();
        int []arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i]= rd.nextInt(10);
        }
        return arr;
    }    
}
