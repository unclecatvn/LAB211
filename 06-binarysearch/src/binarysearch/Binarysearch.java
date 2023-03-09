/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author ADMIN
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 6;
        int first = 0;
        int last = arr.length - 1; // Giảm vị trí cuối cùng xuống 1 đơn vị
//        int mid = (last + first) / 2;
//        while(arr[mid] != k && first <= last){ // Thêm điều kiện kiểm tra vị trí đầu tiên không vượt quá vị trí cuối cùng
//            if(arr[mid] > k){
//                last = mid - 1; // Giảm vị trí cuối cùng xuống 1 đơn vị
//                mid = (int) Math.floor((last + first) / 2); // Sử dụng toán tử int để làm tròn về phía dưới
//            }
//            else{
//                first = mid + 1;
//                mid = (int) Math.floor((last + first) / 2); // Sử dụng toán tử int để làm tròn về phía dưới
//            }
//                }
//                if (arr[mid] == k) {
//                    System.out.println(arr[mid]);
//                } else {
//                    System.out.println("Không tìm thấy phần tử " + k);
//                }
       
        int mid = (first + last) / 2;
        for (; arr[mid] != k ; mid = (int) Math.floor(first + last) / 2){
            if (arr[mid] > k) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        if (arr[mid] == k) {
            System.out.println(arr[mid]);
        } else {
            System.out.println("Không tìm thấy phần tử " + k);
        }

    }//end  

}//end class
