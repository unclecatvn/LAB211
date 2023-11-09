/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0056;

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
                if (choice > 6 || choice < 1) {
                    //nếu người dùng nhập option cần sử dụng ngoài khoang 1-4 thì chương trình sẽ bắt người dùng 
                    //nhập lại cho đến khi nào người dùng nhập đúng
                    System.out.println("Please choose option from 1-6 !!!");
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
    
    public int getSalary(String mess) {
        int salary;
        do {
            try {
                System.out.print(mess);
                salary = Integer.parseInt(sc.nextLine());
                if (salary < 0 ) {
                    throw new Exception("Salary phai lon hon 0");
                }
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số hay không
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        return salary;
    }
    
    public int getSalaryCurrent(String mess) {
        int salary;
        do {
            try {
                System.out.print(mess);
                salary = Integer.parseInt(sc.nextLine());
                if (salary < 0 ) {
                    throw new Exception("Salary phai lon hon 0");
                }
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số hay không
                System.out.println(e.getMessage());
                continue;
            }
            break;
        } while (true);
        return salary;
    }

    public int getID(String mess) {
        int id;
        do {
            try {
                System.out.print(mess);
                id = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số hay không
                System.out.println("Please input valid id !!!");
                continue;
            }
            break;
        } while (true);
        return id;
    }
}
