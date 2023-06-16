package ru.gb.jcore.seminar3;

import java.util.Comparator;

public class CompareSalary<E extends Employee> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
