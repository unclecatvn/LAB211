
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PHAM KHAC VINH
 */
public class Utility {
    
    public final String REGEX_USERNAME = "\\d{10}";
    public final String REGEX_PASSWORD = "(?=.*\\d.*)(?=.*[a-zA-Z].*).{8,31}"; //(?=.*\\d.*) phải có ít nhất 1 chữ/số | ít nhất 8 kí tự và nhiều nhất 31 kí tự
    public final String REGEX_CAPTCHA = "[a-zA-Z0-9]+";
    
    Scanner scanner = new Scanner(System.in);

    public int getInt(String message, String firstError, String secondError,
            String thirdError, int min, int max) { //trả về 1 số nguyên nằm trong khoảng min đến max
        while (true) { //vòng lặp yêu cầu người dùng nhập 1 chuỗi
            try {
                System.out.print(message); 
                String input = scanner.nextLine().trim(); 
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!"); //chuỗi rỗng
                } else {
                    int number = Integer.parseInt(input); //Chuyển đổi chuỗi thành số nguyên
                    if (number < min) { //nhỏ hơn min
                        System.out.println(firstError);
                    } else if (number > max) { //lớn hơn max
                        System.out.println(secondError);
                    } else {
                        return number; //trả về số nguyên đó và kết thuốc
                    }
                }
            } catch (Exception e) { //chuyển đổi thất bại, in ra lỗi
                System.out.println(thirdError);
            }
        }
    }

    public double getDouble(String message, String firstError, String secondError,
            String thirdError, double min, double max) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    double number = Double.parseDouble(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }

    public float getFloat(String message, String firstError, String secondError,
            String thirdError, double min, double max) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    float number = Float.parseFloat(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }

    public String getString(String message, String error, String regex) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty !!");
            } else {
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println(error);
                }
            }
        }
    }
}
