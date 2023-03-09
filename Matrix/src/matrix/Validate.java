/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validate {

    public Validate() {
    }
    
    public int inputInt(String msg){
        while(true){
            Scanner sc = new Scanner(System.in);
            int input;
            try{
                input = sc.nextInt();
                return input;
            }catch(Exception e){
                System.out.println("Value must be digit");
                System.out.println("Reinput!");
                System.out.println(msg);
            }
        }
    }
}
