/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.util.Arrays;

/**
 *
 * @author Nam
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //use recursion to find fibonaci sequence
        int[] array  = findSequence();
//
        //display sequence
        displaySequence(array);
        
    }
    
    public static int[] findSequence() {
        int[] array = new int[46];
        
        fib(array, 0);
        return array;
    }
    
    private static void displaySequence(int[] array) {
        System.out.println("The sequence: " + Arrays.toString(array));
    }
    
    private static void fib(int[] array, int count) {
        
        // Nếu biến đếm bằng 0 hoặc 1, gán giá trị tương ứng cho phần tử đầu tiên và thứ hai của mảng
        if (count == 0 || count == 1) {
            array[count] = count;
        } // Nếu không, tính toán giá trị mới bằng cách lấy tổng của hai giá trị trước đó trong mảng và gán cho phần tử hiện tại của mảng
        else {
            array[count] = array[count - 1] + array[count - 2];
        }
        // Tăng biến đếm lên 1 để tiếp tục tính toán giá trị cho vị trí tiếp theo của mảng
        count++;
        // Nếu biến đếm bằng chiều dài của mảng, kết thúc đệ quy và trả về
        if (count == array.length) {
            return;
        }
        // Gọi lại phương thức để tính toán giá trị tiếp theo của dãy số Fibonacci bằng cách sử dụng đệ quy
        fib(array, count);
        
    }
}//end class
