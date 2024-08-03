package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int size = scanner.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println(hasConsecutiveFour(values) ? "The series contains four consecutive numbers with the same value." : "The series does not contain four consecutive numbers with the same value.");

        scanner.close();
    }

    public static boolean hasConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
