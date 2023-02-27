/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {
        Utility utility = new Utility();
        Ebank ebank = new Ebank();
        
        while (true) {
            displayMenu();
            int option = utility.getInt("Please choice one option:", "Wrong", "Wrong", "Wrong", 1, 3);

            switch (option) {
                case 1:
                    ebank.loginVietNamese();
                    break;
                case 2:
                    ebank.loginEnglish();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }

    private static void displayMenu() {
        System.out.println("-------Login Program-------\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit");
    }
}
