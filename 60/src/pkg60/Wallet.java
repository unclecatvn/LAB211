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
//public class Wallet extends Person {
public class Wallet extends Person {
    public static int inputWallet(){
        System.out.println("Input value of wallet: ");
        int wallet = checkInput();
        return wallet;
               
    } 
    
    public static int congBills(int[] bill){
        int total = 0;
        for(int i =0; i < bill.length; i++){
            total += bill[i];
        } return total;
    }
    
    public static int checkBills(int[] bill, int wallet){
//    public static int checkBills(int total, int wallet){
        int total = congBills(bill);
        System.out.println("This total bill in: " + total);
        if(total > wallet){
            System.out.println("You can't buy it");
        }else{
            System.out.println("You can buy it");
        }
        return 0;
    }


}
