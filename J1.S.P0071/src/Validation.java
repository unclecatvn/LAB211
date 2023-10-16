
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 * Class này sẽ có chức năng chứa các hàm kiểm tra dữ liệu mà người dùng nhập
 * vào
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    /**
     *
     *
     * Hàm này sẽ có chức năng kiểm tra option mà người dùng nhập vào
     */
    public int getChoice(String mess) {
        int choice;
        do {
            try {
                System.out.println(mess);
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 4 || choice < 1) {
                    //nếu người dùng nhập option cần sử dụng ngoài khoang 1-4 thì chương trình sẽ bắt người dùng 
                    //nhập lại cho đến khi nào người dùng nhập đúng
                    System.out.println("Please choose option from 1-4 !!!");
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

    /**
     * Hàm này sẽ có chức năng kiểm tra xem người dùng có bỏ trống phần nhập dữ
     * liệu hay không
     */
    public String getText(String mess) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(mess);
            name = sc.nextLine();
            if (name.trim().isEmpty()) { //nếu người dùng bỏ trống thì chương trình sẽ bắt nhập lại
                continue;
            } else {
                break;
            }
        } while (true);
        return name;
    }

    /**
     *
     * Hàm này sẽ có chức năng kiểm tra thời gian mà người dùng nhập vào
     */
    public String getDate() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");//set form mà người dùng phải nhập đúng
        dateFormat.setLenient(false);
        // kiểm tra và ngăn chặn việc nhảy ngày khi người dùng nhập sai số ngày của một tháng nào đó
        //ví dụ: tháng 2 có 28 ngày nhưng người dùng nhập 30 ngày thì hàm setLenient sẽ chạy để kiểm tra nó và bắt người dùng nhập lại
        String text = "";//khởi tạo biến để lưu trữ dữ liệu mà người dùng nhập vào từ bàn phím
        while (true) {
            try {
                System.out.print("Enter date(day-month-year): ");
                text = sc.nextLine();
                dateFormat.parse(text.trim());//chuyển đổi date thành string để in ra màn hình 
            } catch (Exception e) {
                System.out.println("Please enter again !!!");
                continue;
            }
            break;
        }
        return text;
    }

    /**
     * Hàm này sẽ kiểm tra xem thời gian bắt đầu công việc mà người dùng nhập
     * vào đã đúng hay chưa
     */
    public double getFrom() {
        double from;
        do {//vòng lặp này sẽ chạy cho đến khi nào người dùng nhập dữ liệu đúng với điều kiện của chương trình đưa ra
            try {
                System.out.print("Enter from: ");
                String input = sc.nextLine();
                from = Double.parseDouble(input);
                if (from < 8 || from > 17.5 || from % 0.5 != 0 || !input.matches("\\d+(\\.\\d)?")) {
                    //nếu người dùng nhập các số ngoài khoảng 8-17.5 và những số đó không chia hết cho 0.5 trừ 8.5 
                    //thì chương trình sẽ yêu cầu người dùng phải nhập lại
                    System.out.println("Please input plan from 8.0 to 17.5 !!!");
                    continue;
                }
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số không ?
                System.out.println("Invalid double");
                continue;
            }
            break;
        } while (true);
        return from;
    }

    /**
     * Hàm này sẽ có chức kiểm tra xem thời gian kết thúc công việc mà người
     * dùng nhập vào đã đúng hay chưa
     */
    public double getTo(double from) {
        double to;
        do {//vòng lặp này sẽ chạy cho đến khi nào người dùng nhập dữ liệu đúng với điều kiện của chương trình đưa ra
            try {
                System.out.print("Enter to: ");
                to = Double.parseDouble(sc.nextLine());
                if (to < 8 || to > 17.5 || to % 0.5 != 0) {
                    //nếu người dùng nhập các số ngoài khoảng 8-17.5 và những số đó không chia hết cho 0.5 
                    //thì chương trình sẽ yêu cầu người dùng phải nhập lại
                    System.out.println("Please input plan from 8.0 to 17.5 !!!");
                    continue;
                }
                if (to <= from) {
                    System.out.println("To must be greater than from!");
                    continue;
                }
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số không ?
                System.out.println("Invalid double");
                continue;
            }
            break;
        } while (true);
        return to;
    }

    /**
     * Hàm này sẽ có chức năng kiểm tra phần id mà người dùng nhập vào khi xử
     * dụng option 2 là delete task
     */
    public int getID() {
        int id;
        do {
            try {
                System.out.print("Enter id: ");
                id = Integer.parseInt(sc.nextLine());
                if (id < 1) {//nếu người dùng nhập id < 1 thì chương trình sẽ yêu cầu người dùng phải nhập lại
                    continue;
                }
            } catch (Exception e) {//kiểm tra xem người dùng có nhập các kí tự khác ngoài số hay không
                System.out.println("Please input valid id !!!");
                continue;
            }
            break;
        } while (true);
        return id;
    }
}
