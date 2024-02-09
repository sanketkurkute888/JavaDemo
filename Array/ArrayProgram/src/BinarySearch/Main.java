package BinarySearch;

import java.util.Scanner;

class Sort {
    public static void bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Search {
    public static boolean linearSearch(int[] arr, int size, int data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int size, int data) {

        Sort.bubbleSort(arr, size);
        int beg = 0, end = size - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] < data) {
                beg = mid + 1;
            } else if (arr[mid] > data) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data, size, ch;
        char choice;

        System.out.print("Enter the size of an array: ");
        size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the data you want to search: ");
        data = scanner.nextInt();

        System.out.println("Press 1 for linear search");
        System.out.println("Press 2 for Binary search");
        System.out.print("Enter your choice: ");
        ch = scanner.nextInt();

        switch (ch) {
            case 1:
                if (Search.linearSearch(arr, size, data)) {
                    System.out.println("Data found");
                } else {
                    System.out.println("Data not found");
                }
                break;
            case 2:
                if (Search.binarySearch(arr, size, data)) {
                    System.out.println("Data found");
                } else {
                    System.out.println("Data not found");
                }
                break;
            default:
                System.out.println("Incorrect choice");
                break;
        }

        System.out.print("Do you want to continue Y/N: ");
        choice = scanner.next().charAt(0);
        while (choice == 'Y' || choice == 'y') {
            // Perform the desired action for continuing the loop
            // For simplicity, let's just exit the loop here
            break;
        }

        scanner.close();
    }
}


