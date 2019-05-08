package org;

import java.util.Random;

public class MixedLetters {
    public void MixLetters(String s) {

        Random random = new Random();

        String[] split = s.split("\\s+"); //разделяем строку на слова
        for (int i1 = 0; i1 < split.length; i1++) {
            String words = split[i1];               //в переменную words через цикл заносятся отдельные слова
            char[] wordsArr = words.toCharArray();  //из них делается массив типа char
            for (int i = 1; i < wordsArr.length - 1; ++i) {             //перебор элементов массива от 2й
                int j = random.nextInt(wordsArr.length - 2) + 1; //и до предпоследней буквы каждого слова
                char t = wordsArr[i];
                wordsArr[i] = wordsArr[j];
                wordsArr[j] = t;
            }
            System.out.print(new String(wordsArr) + " ");
        }
        System.out.println();

    }
}