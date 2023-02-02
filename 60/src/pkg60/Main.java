/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg60;


/**
 *
 * @author Nam
 */


public class Main {
    
//    public static int checkBills(int total, int wallet){
//        System.out.println("This total bill in: " + total);
//        if(total < wallet){
//            System.out.println("You can't buy it");
//        }else{
//            System.out.println("You can buy it");
//        }
//        return 0;
//    }
    
    public static void main(String[] args) {
        
//        Person person = new Person();
        int[] inputBill = Person.inputBill();
        
//        Wallet wallet = new Wallet();
        int inputWallet = Wallet.inputWallet();
        
        Wallet.checkBills(inputBill, inputWallet);
    }
}   
