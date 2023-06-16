//1. Создать класс ”Сотрудник” с полями: ФИО, должность, телефон, зарплата, возраст;
//2. Написать функцию выводящую всю доступную информацию об объекте или вывод с форматированием
//3. Создать массив сотрдников и метод, который будет увеличивать зарплату сотрудникам, у которых возраст превышает 45 лет.

package ru.gb.jcore.seminar3;

//import java.util.Collections;
import java.util.List;

public class Employee<E extends Employee> {
    public String fIO;
    public String jobTitle;
    public String tel;
    public int salary;
    public int age;
//    List<E> employees;

    public Employee(String fIO, int salary, int age){
        this.fIO=fIO;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Сотрудник " + this.getFIO() + " в должности " + this.jobTitle + " в возрасте " + this.getAge() + " лет " +
                " имеет зарплату " + this.getSalary() + " руб. Номер телефона сотрудника " + this.tel;
    }

    public void printEmployee(){
        System.out.println(this.toString());
    }

    public String getFIO() {
        return fIO;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

//    public void sortByAge() {
//        Collections.sort(employees, new CompareAge<E>());
//    }
//
//    public void sortBySalary() {
//        Collections.sort(employees, new CompareSalary<E>());
//    }
}
