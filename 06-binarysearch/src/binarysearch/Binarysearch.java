/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // Nhập số phần tử của mảng
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();

        // Nhập giá trị cần tìm
        System.out.print("Enter search value: ");
        int k = sc.nextInt();

        // Khởi tạo mảng và random các giá trị cho mảng
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }

        // Sắp xếp mảng tăng dần
        Arrays.sort(arr);

        // In ra mảng sau khi sắp xếp
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Tìm kiếm phần tử k trong mảng sử dụng thuật toán binary search
        int first = 0;
        int last = n - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < k) {
                first = mid + 1;
            } else if (arr[mid] == k) {
                System.out.println("Found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not found");
        }
    } 

}//end class
