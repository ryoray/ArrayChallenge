package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sortArray(5);
    }

    public static int[] getInteger(int number){
        System.out.println("Please input your array data\r");
        int[] sourceData = new int[number];

        for (int i=0; i<sourceData.length; i++) {
            sourceData[i] = scanner.nextInt();
        }
        return sourceData;
    }

    public static int[] printArray(int number){
        int[] print = getInteger(number);

        System.out.println("Array data before sorting");
        System.out.println("-------------------------");
        for (int i=0; i<print.length; i++) {
            System.out.println("Element [" + i + "] is " + print[i]);
        }
        return print;
    }

    public static void sortArray(int number){
        int[] toBeSort = printArray(number);
        int[] sorted = new int[number];

        for (int i=0; i<toBeSort.length; i++) {
            int temp = toBeSort[i];
            for (int j=0; j<toBeSort.length; j++) {
                if (temp < toBeSort[j]) {
                    temp = toBeSort[j];
                }
                sorted[j] = temp;
            }
        }

        System.out.println("Array data After sorting");
        System.out.println("-------------------------");
        for (int i=0; i<sorted.length; i++) {
            System.out.println("Element [" + i + "] is " + sorted[i]);
        }
    }
}
