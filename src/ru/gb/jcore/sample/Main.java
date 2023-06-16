package ru.gb.jcore.sample;

import ru.gb.jcore.regular.Decorator;
import ru.gb.jcore.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основаное  назначение и способы взаимодействия с ним
 */
public class Main {
    /**
     * Точка входа в программу. С нее всегда все начинается.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(10,7);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(10,7);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.multi(10,7);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.diff(10,7);
        System.out.println(Decorator.decorate(result));
    }
}