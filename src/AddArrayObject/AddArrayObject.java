package AddArrayObject;

import java.util.Scanner;

public class AddArrayObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input array's length: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Array's length exceed 20, please try again.");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input element of array %d: ", (i + 1));
            arr[i] = input.nextInt();
        }

        System.out.print("Current Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\nEnter element want to add: ");
        int newElement = input.nextInt();
        System.out.print("Enter index want to add: ");
        int index = input.nextInt();
        int[] newArr = new int[size + 1];
        if (index < 0 && index > arr.length - 1) {
            System.out.println("Out of current array's range");
        } else {
            System.out.print("New Array: ");
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = newElement;
                } else {
                    newArr[i] = arr[i - 1];
                }
                System.out.print(newArr[i] + "\t");
            }
        }
    }
}
