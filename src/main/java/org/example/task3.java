package org.example;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class task3 {
    public static void main(String[] args) {
        int n, num, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            boolean f = true;
            for (int j = 2; j <= num/2; j++) {
                if (num%j == 0){
                    f = false;
                }
            }
            if (f && num >0){
                sum += num;
            }
        }
        System.out.println("Сумма: "+sum);
    }
}
