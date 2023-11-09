/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HoaiNam
 */
public class WorkManage {

    ArrayList<Work> list = new ArrayList<>();//khởi tạo một list để lưu trữ dữ liệu mà người dùng nhập vào
    Validation v = new Validation();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Add worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display salary update");
        System.out.println("5. Display");
        System.out.println("6. EXIT");
        int choice = v.getChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                String id = v.getText("Enter code: ");
                upSalary(id);
                break;
            case 3:
                id = v.getText("Enter code: ");
                downSalary(id);
                break;
            case 4:
                displayTaskUpdate();
                break;
            case 5:
                displayTask();
                break;
            case 6:
                System.exit(0);
        }
    }

    public void addTask() {
        String id = v.getText("Enter code: ");
        String name = v.getText("Enter name: ");
        int age = v.getID("Enter age: ");
        int salary = v.getSalary("Enter salary: ");
        String date = v.getText("Enter date: ");
        Work w = new Work(id, name, age, salary, null, date);
        list.add(w);
        System.out.println("Add successfully!");
    }

    public void upSalary(String id) {
        // Biến để theo dõi việc tìm thấy Work.
        boolean found = false;
        // Biến để lưu trữ Work cuối cùng với ID phù hợp.
        Work lastUpdatedWork = null;
        // Tìm Work cuối cùng có ID phù hợp và lương chưa được cập nhật.
        for (int i = list.size() - 1; i >= 0; i--) {
            Work w = list.get(i);
            if (w.getId().equalsIgnoreCase(id)) {
                lastUpdatedWork = w; // Lưu trữ Work tìm thấy.
                found = true;
                break; // Khi tìm thấy Work, dừng vòng lặp.
            }
        }
        // Nếu tìm thấy Work, thực hiện cập nhật lương.
        if (found) {
            int salaryCurrent = v.getSalaryCurrent("Enter salary: ");
            int newSalary = salaryCurrent + lastUpdatedWork.getSalary();
            // Tạo Work mới với lương đã cập nhật.
            Work newWork = new Work(lastUpdatedWork.getId(), lastUpdatedWork.getName(), lastUpdatedWork.getAge(), newSalary, true, lastUpdatedWork.getDate());
            // Thêm Work mới vào danh sách.
            list.add(newWork);
            newWork.setSalaryUpdate(true);
            System.out.println("Salary updated to: " + newSalary);
        } else {
            System.out.println("Worker with ID " + id + " not found!");
        }
    }

    public void downSalary(String id) {
        // Biến để theo dõi việc tìm thấy Work.
        boolean found = false;
        // Biến để lưu trữ Work cuối cùng với ID phù hợp.
        Work lastUpdatedWork = null;
        // Tìm Work cuối cùng có ID phù hợp và lương chưa được cập nhật.
        for (int i = list.size() - 1; i >= 0; i--) {
            Work w = list.get(i);
            if (w.getId().equalsIgnoreCase(id)) {
                lastUpdatedWork = w; // Lưu trữ Work tìm thấy.
                found = true;
                break; // Khi tìm thấy Work, dừng vòng lặp.
            }
        }

        // Nếu tìm thấy Work, thực hiện cập nhật lương.
        if (found) {
            int salaryCurrent = v.getSalaryCurrent("Enter salary: ");
            int newSalary = lastUpdatedWork.getSalary() - salaryCurrent;
            if (newSalary < 0) {
                System.out.println("Salary cannot be negative. Transaction aborted.");
                return;
            }
            // Tạo Work mới với lương đã cập nhật.
            Work newWork = new Work(lastUpdatedWork.getId(), lastUpdatedWork.getName(), lastUpdatedWork.getAge(), newSalary, false, lastUpdatedWork.getDate());
            // Thêm Work mới vào danh sách.
            list.add(newWork);
            newWork.setSalaryUpdate(true);
            System.out.println("Salary updated to: " + newSalary);
        } else {
            System.out.println("Worker with ID " + id + " not found!");
        }
    }

    public void displayTaskUpdate() {
        if (list.isEmpty()) {
            System.out.println("There is nothing here.");
        } else {
            // Sắp xếp list dựa trên lương tăng dần
            Collections.sort(list, new Comparator<Work>() {
                @Override
                public int compare(Work w1, Work w2) {
                    return Integer.compare(w1.getSalary(), w2.getSalary());
                }
            });

            System.out.println("DISPLAY ALL TASK: ");
            System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s", "ID", "Name", "Age", "Salary", "Status", "Date");
            System.out.print("\n");
            for (Work w : list) {
                if (w.isSalaryUpdate()) {
                    System.out.printf("%-15s%-20s%-20d%-20d%-20s%-20s", w.getId(), w.getName(), w.getAge(), w.getSalary(), w.getStatus(), w.getDate());
                    System.out.print("\n");
                }
            }
        }
    }

    public void displayTask() {
        if (list.isEmpty()) {
            System.out.println("There is nothing here.");
        } else {
            System.out.println("DISPLAY ALL TASK: ");
            System.out.printf("%-15s%-20s%-20s%-20s%-20s%-20s", "ID", "Name", "Age", "Salary", "Status", "Date");
            System.out.print("\n");
            for (Work w : list) {
                System.out.println(w);
            }
        }
    }
}
