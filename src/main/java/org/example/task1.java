package org.example;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел.
 * Найти количество положительных чисел, после которых следует отрицательное число.
 */
public class task1 {
    public static void main(String[] args) {
        int n, quant = 0, a, b;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                quant++;
            }
            b = a;
        }
        System.out.println("quantity: " + quant);
        scanner.close();
    }
}
