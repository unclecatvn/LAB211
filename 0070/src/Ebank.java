
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PHAM KHAC VINH
 */
public class Ebank {

    Utility utility = new Utility();

    void loginVietNamese() {
        Locale localeVi = new Locale("vi");
        loginFunction(localeVi);
    }

    void loginEnglish() {
        Locale localeEn = new Locale("en");
        loginFunction(localeEn);
    }

    private void loginFunction(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("language/message", locale); //class đa ngôn ngữ 

        utility.getString(bundle.getString("messageUsername"),
                bundle.getString("messageUsernameError"), utility.REGEX_USERNAME);

        utility.getString(bundle.getString("messagePassword"),
                bundle.getString("messagePasswordError"), utility.REGEX_PASSWORD);

        handleCaptcha(bundle.getString("messageCaptcha"),
                bundle.getString("messageCaptchaInput"),
                bundle.getString("messageCaptchaError"));
    }

    private void handleCaptcha(String messageCaptcha, String msgInput, String error) {
        //generate captcha
        String generateCaptcha = generateCaptcha();
        System.out.println(messageCaptcha + generateCaptcha);
        
        while (true) {
            //input captcha
            String inputCaptcha = utility.getString(msgInput, "Captcha must be alphanumeric",
                    utility.REGEX_CAPTCHA);

            //compare captcha generate with input catpcha
            if (!generateCaptcha.contains(inputCaptcha)) {
                System.out.println(error);
            } else {
                break;
            }
        }

    }

    private String generateCaptcha() {
        Random random = new Random(); //sinh ra số ngẫu nhiên
        //khởi tạo biến
        int number; //lưu 1 giá trị của 1 kí tự trong captcha
        String captcha = ""; //lưu 1 chuỗi hoàn chỉnh catpcha
        //vòng lặp sinh ra 6 kí tự
        for (int i = 0; i < 6; i++) {
            int base = Math.abs(random.nextInt()) % 62; //sinh ra số nguyên dương bất kỳ /62 | gắn biến base 
            if (base < 26) {
                number = 65 + base;  //ra giá trị ASCII -> ra chữ cái in hoa A -> Z
            } else if (base < 52) {
                number = 97 + (base - 26); //siinh ra chữ in cái thường a -> z
            } else {
                number = base - 4; //0-9
            }

            char character = (char) number; 
            captcha = captcha + character; //nối chuỗi
        }
        return captcha;
    }

}
