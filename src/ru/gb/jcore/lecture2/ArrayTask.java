package ru.gb.jcore.lecture2;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(shift(array,5)));
    }

    public static int[] shift(int[] array, int n){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i+n==array.length){
                n=-i;
            }
            newArray[i] = array[i+n];
        }
        return newArray;
    }
}
