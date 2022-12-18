package org.example;

import java.util.Scanner;

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем.
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 */
public class task2 {
    public static void main(String [] args){
        int n, a, b, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0){
                sum += a;
            }
            a = b;
        }
        System.out.println("Сумма: "+sum);
        scanner.close();
    }

}
