package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(5);
    }

    public static int[] getInteger(int number){
        System.out.println("Please input your array data\r");
        int[] sourceData = new int[number];

        for (int i=0; i<sourceData.length; i++) {
            sourceData[i] = scanner.nextInt();
        }
        return sourceData;
    }

    public static void printArray(int number){
        int[] print = getInteger(number);

        System.out.println("Array data before sorting");
        System.out.println("-------------------------");
        for (int i=0; i<print.length; i++) {
            System.out.println("Element [" + i + "] is " + print[i]);
        }
    }

    public static void sortArray(int number){
        int[] toBeSort = getInteger(number);
        int[] sorted = new int[number];
        int temp = toBeSort[0];                             // temp = 2

        for (int i=0; i<toBeSort.length; i++) {
            for (int j=0; j<toBeSort.length; j++) {
                if (temp < toBeSort[j]) {
                    temp = toBeSort[j];
                }
                sorted[]
            }
        }
    }
}
