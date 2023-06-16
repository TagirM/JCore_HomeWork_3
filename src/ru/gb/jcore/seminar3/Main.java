package ru.gb.jcore.seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 13000, 30);
        employee1.jobTitle = "инженер";
        employee1.tel = "89034563121";
        Employee employee2 = new Employee("Иванов Петр Иванович", 13000, 50);
        employee2.jobTitle = "инженер";
        employee2.tel = "89034563122";
        Employee employee3 = new Employee("Иванов Егор Иванович", 15000, 45);
        employee3.jobTitle = "инженер";
        employee3.tel = "89034563123";
        Supervisor supervisor = new Supervisor("Юков Александр Иванович", 25000, 55);
        supervisor.jobTitle = "заместитель генерального директора";
        supervisor.tel = "89034563124";

        Employee[] employees = {employee1, employee2, employee3, supervisor};
        Supervisor.salaryUp(employees);
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployee();
        }
        CompareAge compareAge = new CompareAge();
        if (compareAge.compare(employee1, employee2) < 0) {
            System.out.println("Возраст " + employee2.getFIO() + " больше возраста " + employee1.getFIO());
        } else if (compareAge.compare(employee1, employee2) > 0){
            System.out.println("Возраст " + employee1.getFIO() + " больше возраста " + employee2.getFIO());
        }
        else {
            System.out.println("Возраст сотрудников" + employee1.getFIO() + " и " + employee2.getFIO() + "совпадает");
        }


        CompareSalary compareSalary = new CompareSalary();
        if (compareSalary.compare(supervisor, employee3) < 0) {
            System.out.println("Возраст " + employee3.getFIO() + " больше возраста " + supervisor.getFIO());
        } else if (compareAge.compare(employee1, employee2) > 0){
            System.out.println("Возраст " + supervisor.getFIO() + " больше возраста " + employee3.getFIO());
        }
        else {
            System.out.println("Возраст сотрудников" + supervisor.getFIO() + " и " + employee3.getFIO() + "совпадает");
        }

//        List employee = new ArrayList<>();
//        employee.add(employee1);
//        employee.add(employee2);
//        employee.add(employee3);
//        employee.add(supervisor);
//        employeeList.sortByAge();
    }
}
