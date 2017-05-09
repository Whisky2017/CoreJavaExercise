package com.test.EmployeeTest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by wskyt on 2017/4/5.
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Carl",75000,2017,4,1);
        employees[1] = new Employee("Harry",50000,2017,4,1);
        employees[2] = new Employee("Tony",40000,2017,4,1);

        for (Employee e : employees){
            e.raiseSalary(5);
            System.out.println(e.toString());
        }

//        System.out.println(employees[0].getClass());


    }
}
class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(){
        name = "";
        salary = 0;
        hireDay = new Date();
    }

    public Employee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return (Date)hireDay.clone();
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        salary += salary * byPercent/100;
    }

    public String toString(){
        return "name = " + name + ", salary = " + salary + ", hireday = " + hireDay;
    }


}