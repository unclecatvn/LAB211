/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg60;


import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Person {
    public static Scanner in = new Scanner(System.in);
    protected static int checkInput(){        
    //vonglap
    while(true){
            //tim loi
            try {
//                System.out.println("Input nummber of bill: ");
                int result = Integer.parseInt(in.nextLine());
//                System.out.println(result);
                return result;
                
            } catch (NumberFormatException e) {
                System.err.println("Loi nhap khong dung");
                System.out.println("Input nummber of bill: ");
//                System.out.println("Vui long nhap lai");
            }
    }
    
    }
    
    //check tong so bill la bao nhieu
    public static int[] inputBill(){
        System.out.println("Input nummber of bill: ");
        int size = checkInput();
        //khoi tao mang
        int[] bill = new int[size];
        for(int i = 0; i < bill.length; i++){
            System.out.println("Input value of bill " + (i+1) + ":");
            bill[i] = checkInput();
        }
        return bill;
        
    }
    
    
}    
