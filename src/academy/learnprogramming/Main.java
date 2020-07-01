package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
        printArray(myIntegers);
        sortArray(myIntegers);
    }

    public static int[] getInteger(int number){
        System.out.println("Please input your array data\r");
        int[] sourceData = new int[number];

        for (int i=0; i<sourceData.length; i++) {
            sourceData[i] = scanner.nextInt();
        }
        return sourceData;
    }

    public static void printArray(int[] sourceData){
        System.out.println("Array data before sorting");
        System.out.println("-------------------------");
        for (int i=0; i<sourceData.length; i++) {
            System.out.println("Element [" + i + "] is " + sourceData[i]);
        }
    }

    public static int[] sortArray(int[] number){
        int[] sortedArray = new int[number.length];
        for (int i=0; i<number.length; i++) {
            sortedArray[i] = number[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("Array data After sorting");
        System.out.println("-------------------------");
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Element [" + i + "] is " + sortedArray[i]);
        }
        return sortedArray;
    }
}
