package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setProperty("console.encoding","Cp866");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine(); //в строку s заносится введенный текст
        MixedLetters newMix = new MixedLetters();
        newMix.MixLetters(s);

    }
}