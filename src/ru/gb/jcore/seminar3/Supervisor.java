package ru.gb.jcore.seminar3;

public class Supervisor extends Employee{
    public Supervisor(String fIO, int salary, int age) {
        super(fIO, salary, age);
    }

    public static void salaryUp(Employee[] employees, int age, int add) {
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i] instanceof Supervisor)) {
                if (employees[i].age > age) {
                    employees[i].salary = employees[i].salary + add;
                }
            }
        }
    }

    public static void salaryUp(Employee[] employees) {
        Supervisor.salaryUp(employees, 45, 5000);
    }
}
