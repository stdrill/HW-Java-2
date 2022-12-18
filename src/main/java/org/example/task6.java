package org.example;

import java.util.Arrays;

/**
 * Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class task6 {
    public static void main(String[] args) {
        int [] arr = new int[]{-3,45,12,7,-9};
        int sumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 9) && (arr[i] < 100)) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]=sumIndex;
            }
        }
        System.out.println("Измененный массив: "+ Arrays.toString(arr));
    }
}
