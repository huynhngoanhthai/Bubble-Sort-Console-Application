package com.spring.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    private final Scanner scanner = new Scanner(System.in);
    private final Backend backend;

    public Display(Backend backend){
        this.backend = backend;
    }
    public void showMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Main Menu =====");
            System.out.println("1. Enter array elements");
            System.out.println("2. Sort array in ascending order");
            System.out.println("3. Sort array in descending order");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");

            int choice = getValidIntegerInput();

            switch (choice) {
                case 1:
                    this.backend.setArray(enterArrayElements());
                    break;
                case 2:
                    if (this.backend.getArray() != null) {
                        this.backend.sortAscending();
                        System.out.println("Array sorted in ascending order:");
                        printArray(this.backend.getArray());
                    } else {
                        System.out.println("Array is not initialized. Please enter array elements first.");
                    }
                    break;
                case 3:
                    if (this.backend.getArray() != null) {
                        this.backend.sortDescending();
                        System.out.println("Array sorted in descending order:");
                        printArray(this.backend.getArray());
                    } else {
                        System.out.println("Array is not initialized. Please enter array elements first.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the menu. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        this.scanner.close();
    }

    private int[] enterArrayElements() {
        System.out.print("Enter the number of elements in the array: ");
        int length = getValidIntegerInput();

        if (length <= 0) {
            System.out.println("The array length must be greater than 0.");
            return null;
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = getValidIntegerInput();
        }

        return array;
    }

    private void printArray(int[] array) {
        for (int i : array) {
            System.out.print("["+i+"]" + " -> ");
        }
        System.out.println();
    }

    private int getValidIntegerInput() {
        while (true) {
            try {
                return this.scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                this.scanner.next(); // Clear the invalid input
            }
        }
    }
}
