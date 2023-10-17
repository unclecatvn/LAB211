/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HoaiNam
 */
public class ManageEastAsiaCountries {

    ArrayList<EastAsiaCountries> list = new ArrayList<>();//khởi tạo một list để lưu trữ dữ liệu mà người dùng nhập vào
    Validation v = new Validation();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of contries sorted name in ascending order");
        System.out.println("5. EXIT");
        int choice = v.getChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                displayTask();
                break;
            case 3:
                String name = v.getText("Enter the name of the country: ");
                searchTask(name);
                break;
            case 4:
                displaySortedTask();
                break;
            case 5:
                System.exit(0);
        }
    }

    public void addTask() {
        String countryCode = v.getCountryCode("Enter code of country: ");
        String countryName = v.getText("Enter name of country: ");
        float totalArea = v.getFloat();
        String terrain = v.getText("Enter terrain of country: ");
        EastAsiaCountries ea = new EastAsiaCountries(countryCode, countryName, totalArea, terrain);
        list.add(ea);
        System.out.println("Add successfully!");
    }

    public void searchTask(String name) {
        boolean found = false;
        for (EastAsiaCountries ea : list) {
            if (ea.getCountryName().equalsIgnoreCase(name)) {
                System.out.println("Country found:");
                System.out.printf("%-15s%-20s%-20s%-20s", "countryCode", "countryName", "totalArea", "terrain");
                System.out.print("\n");
                System.out.println(ea);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Country not found!");
        }
    }

    public void displayTask() {
        if (list.isEmpty()) {
            System.out.println("There is nothing here.");
        } else {
            System.out.println("DISPLAY TASK: ");
            System.out.printf("%-15s%-20s%-20s%-20s", "countryCode", "countryName", "totalArea", "terrain");
            System.out.print("\n");
            System.out.println(list.get(list.size() - 1).toString());
        }
    }

    public void displaySortedTask() {
        if (list.isEmpty()) {
            System.out.println("There is nothing here.");
        } else {
            // Sắp xếp danh sách trước
            Collections.sort(list, (ea1, ea2) -> ea1.getCountryName().compareTo(ea2.getCountryName()));
            System.out.println("DISPLAY TASK (Sorted by Name): ");
            System.out.printf("%-15s%-20s%-20s%-20s", "countryCode", "countryName", "totalArea", "terrain");
            System.out.print("\n");
            for (EastAsiaCountries ea : list) {
                System.out.println(ea);
            }
        }
    }
}
