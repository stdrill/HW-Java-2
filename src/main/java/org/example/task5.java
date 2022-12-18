package org.example;

/**
 * Дан массив целых чисел. Найти сумму элементов,
 * у которых последняя и предпоследняя цифры равны.
 */
public class task5 {
    public static void main(String [] args){
        int[] arr = new int[]{-33,454,678,899,55};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%10) == (arr[i]/10%10)){
                sum += arr[i];
            }
        }
        System.out.println("Сумма: "+sum);
    }
}
