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
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MatrixManage mm = new MatrixManage();
        Validate v = new Validate();
        int choice;
        int [][] matrix1;
        int [][] matrix2;
        int [][] result;
        while(true){
            System.out.println("=======Caculator program======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplicatiion Matrix");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            try {
                choice = sc.nextInt();
                if(choice>4 || choice<1){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid choice");
                break;
            }
            switch(choice){
                case 1:
                    matrix1 = mm.getInput(1);
                    matrix2 = mm.getInput(2);
                    mm.display(matrix1);
                    System.out.println("+");
                    mm.display(matrix2);
                    System.out.println("=");
                    mm.adition(matrix1, matrix2);
                    break;
                case 2:
                    matrix1 = mm.getInput(1);
                    matrix2 = mm.getInput(2);
                    mm.display(matrix1);
                    System.out.println("-");
                    mm.display(matrix2);
                    System.out.println("=");
                    mm.subtraction(matrix1, matrix2);
                    break;
                case 3:
                    matrix1 = mm.getInput(1);
                    matrix2 = mm.getInput(2);
                    mm.display(matrix1);
                    System.out.println("*");
                    mm.display(matrix2);
                    System.out.println("=");
                    mm.multiply(matrix1, matrix2);
                    break;
                case 4:
                    break;
            }
        }
    }    
}
