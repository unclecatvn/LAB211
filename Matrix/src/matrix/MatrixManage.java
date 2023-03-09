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
public class MatrixManage {
    Scanner sc = new Scanner(System.in);
    Validate v = new Validate();
    public MatrixManage() {
    }
    public int[][] getInput(int num){
        int row, col;
        System.out.println("Enter Row Matrix " + num);
        row = v.inputInt("Enter Row Matrix " + num);
        System.out.println("Enter Column Matrix " + num);
        col = v.inputInt("Enter Column Matrix " + num);
        int [][]matrix = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("Enter matrx" + num + "[" + (i+1) + "][" + (j+1) + "]");
                matrix[i][j] = v.inputInt("Enter matrx" + num + "[" + (i+1) + "][" + (j+1) + "]");
            }
        }
        return matrix;
    }
    public void adition(int[][] matrix1 ,int[][] matrix2 ){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int [][]result= new int[row1][col1];
        if(row1 != row2 || col1 != col2){
            System.out.println("Can't adition");
            return;
        }else{
            for(int i = 0;i<row1;i++){
                for(int j = 0;j<col1;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        display(result);
    }
    public void subtraction(int[][] matrix1 ,int[][] matrix2 ){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int [][]result= new int[row1][col1];
        if(row1 != row2 || col1 != col2){
            System.out.println("Can't subtraction");
            return;
        }else{
            for(int i = 0;i<row1;i++){
                for(int j = 0;j<col1;j++){
                result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        display(result);
    }
    public void multiply(int[][] matrix1 ,int[][] matrix2 ){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int [][]result= new int[row1][col2];
        if(col1 != row2){
            System.out.println("Can't multiply");
            return;
        }else{
            for(int i = 0;i<row1;i++){
                for(int j = 0;j<col2;j++){
                    for(int k = 0;k<col1;k++){
                        result[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        display(result);
    }
    public void display(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print("["+ matrix[i][j]+"]");    
            }
            System.out.println("");
        }
    }
}


    
    