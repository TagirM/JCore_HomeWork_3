package ru.gb.jcore.lecture2;

import java.util.Arrays;

public class BinaryArray {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,1,0,1};
        System.out.println(Arrays.toString(change(array)));
    }

    public static int[] change(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                newArray[i] = 1;
            }
            else newArray[i] = 0;
        }
        return newArray;
    }
}
