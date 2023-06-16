package ru.gb.jcore.lecture2;

public class Cesar {
    public static void main(String[] args) {
        System.out.println(cipherCesar("eguct", 2, false));
    }

    public static String cipherCesar(String text, int key, boolean crypt) {
        if (text.length() == 0) {
            return null;
        }
        int len = text.length();
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            out[i] = (char) (text.charAt(i) + ((crypt) ? key : -key));
        }
        return new String(out);
    }
}
