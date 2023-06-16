package ru.gb.jcore.regular;

/**
 * Other, очень полезный класс
 */

public class OtherClass {
    /**
     * Функция суммирования двух целых чисел
     * @param a первое слагаемое
     * @param b второе слогаемое
     * @return сумма a и b, без проверки на переполнение переменной;
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Функция деления двух целых чисел
     * @param a делимое
     * @param b делитель
     * @return частное a и b, без проверки на переполнение переменной;
     */
    public static int div(int a, int b) {
        return a / b;
    }
    /**
     * Функция умножения двух целых чисел
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b, без проверки на переполнение переменной;
     */
    public static int multi(int a, int b) {
        return a * b;
    }
    /**
     * Функция вычитания двух целых чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b, без проверки на переполнение переменной;
     */
    public static int diff(int a, int b) {
        return a - b;
    }
}
