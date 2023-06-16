package ru.gb.jcore.regular;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */

public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой "Вот ваше число"
     * @param a - число, требующее декорации
     * @return отформатированная строка
     */
    public static String decorate(int a){
        return String.format("Here is your number: %d.", a);
    }
}
