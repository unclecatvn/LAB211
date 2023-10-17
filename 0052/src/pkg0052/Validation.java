/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0052;

import java.util.Scanner;

/**
 *
 * @author HoaiNam
 */
public class Validation {

    public static final Scanner sc = new Scanner(System.in);

    public int getChoice(String mess) {
        int choice;
        do {
            try {
                System.out.println(mess);
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 5 || choice < 1) {
                    //nếu người dùng nhập option cần sử dụng ngoài khoang 1-4 thì chương trình sẽ bắt người dùng 
                    //nhập lại cho đến khi nào người dùng nhập đúng
                    System.out.println("Please choose option from 1-5 !!!");
                    continue;
                }
            } catch (NumberFormatException e) {//kiểm tra xem người dùng có nhập các kí tự khác không phải là chữ số hay không ?
                System.out.println("Invalid choice !!!");
                continue;
            }
            break;
        } while (true);
        return choice;
    }

    public String getText(String mess) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(mess);
            name = sc.nextLine();
            if (name.trim().isEmpty()) { //nếu người dùng bỏ trống thì chương trình sẽ bắt nhập lại
                continue;
            } else if (!name.matches("^[a-zA-Z]+")) {
                System.out.println("Vui lòng nhập chữ");
            } else {
                break;
            }
        } while (true);
        return name;
    }

    public String getCountryCode(String mess) {
        String code = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(mess);
            code = sc.nextLine();
            if (code.trim().isEmpty() || code.length() > 3) { //nếu người dùng bỏ trống thì chương trình sẽ bắt nhập lại
                System.out.println("Không được nhập quá 3 kí tự, và không được bỏ trống");
                continue;
            } else {
                break;
            }
        } while (true);
        return code;
    }

    //check user input float limit
    public float getFloat() {
        //loop until user input correct
        while (true) {
            try {
                System.out.println("Enter total area: ");
                float result = Float.parseFloat(sc.nextLine());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Please input again");
                }

            } catch (NumberFormatException e) {
                System.err.println("Please input number float");
                System.out.print("Enter again: ");
            }
        }
    }
}
