package Pattern;

import java.util.Scanner;

public class feddback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for each letter: ");
        int n = scanner.nextInt();  // Taking size input from the user (e.g., 5, 7)

        // Create a pattern for each letter and print them in one line
        for (int i = 0; i < n; i++) {
            printP(i, n); // Print the letter P
            System.out.print("  "); // Space between letters
            printA(i, n); // Print the letter A
            System.out.print("  "); // Space between letters
            printL(i, n); // Print the letter L
            System.out.print("  "); // Space between letters
            printA(i, n); // Print the letter A again
            System.out.print("  "); // Space between letters
            printK(i, n); // Print the letter K
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();  // Close the scanner object
    }

    // Function to print a row of letter 'P'
    static void printP(int row, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || (row == 0 && j < n - 1) || (row == n / 2 && j < n - 1) || (j == n - 1 && row > 0 && row < n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    // Function to print a row of letter 'A'
    static void printA(int row, int n) {
        for (int j = 0; j < n; j++) {
            if ((j == 0 || j == n - 1) && row != 0 || (row == 0 && j > 0 && j < n - 1) || row == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    // Function to print a row of letter 'L'
    static void printL(int row, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || (row == n - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    // Function to print a row of letter 'K'
    static void printK(int row, int n) {
        int mid = n / 2;
        for (int j = 0; j < n; j++) {
            if (j == 0 || (j == mid - row) || (j == row - mid && row > mid)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
