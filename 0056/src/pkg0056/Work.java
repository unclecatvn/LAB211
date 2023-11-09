/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0056;

/**
 *
 * @author HoaiNam
 */
public class Work {

    protected String id;
    protected String name;
    protected int age;
    protected int salary;
    protected boolean salaryUpdate;
    protected Boolean status;
    protected String date;

    public Work() {
    }

    public Work(String id, String name, int age, int salary, Boolean status, String date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }
    
    public Work(String id, String name, int age, int salary, String date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String statusCheck() {
        String statusCheck = "";
        if(status == null){
            System.out.println("null");
        }else if(status == false){
            System.out.println("Down");
        }else if(status == true){
            System.out.println("UP");
        }
        return statusCheck;
    }

    public boolean isSalaryUpdate() {
        return salaryUpdate;
    }

    public void setSalaryUpdate(boolean salaryUpdate) {
        this.salaryUpdate = salaryUpdate;
    }

    @Override
    public String toString() {
        String out = String.format("%-15s%-20s%-20d%-20d%-20s%-20s", id, name, age, salary, statusCheck(), date );
        return out;
    }
}
