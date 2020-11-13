package com.lectures.lecture07;

import java.util.Arrays;

public class LoopsExamples {

    public static void main(String[] args) {
//        sumNumbersFromOneToN(3);
//        calculateFactorial(5);
//        calculateFactorialDoWhile(5);
//        printValues();
//        sumNumberFromLoop(5);
//        printAllArrayElements();
//        doesArrayContainsSpecificValue(new int[]{1, 2, 3}, 3);
//        sortArray();
        printTwoDimentionalArrayElements();
    }

    private static void printTwoDimentionalArrayElements(){
        int[][] matrix = {
                {1,2,3,4}, // row 0 values
                {5,6,7,8}, //row 1
        };

        for(int row = 0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void sortArray(){
        String[] array = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        System.out.println("Original values: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Values after sort: " + Arrays.toString(array));
    }

    private static void printAllArrayElements(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int j : array) {
            sum+=j;
        }
        System.out.println(sum);
    }

    private static boolean doesArrayContainsSpecificValue(int[] array, int item){
        for (int j : array) {
            if(item==j){
                System.out.println("Item is found in the array");
                return true;
            }
        }
        System.out.println("Item not found in the array");
        return false;
    }

    private static void printValues(){
        for(int i=10; i>0; i--){
            System.out.println("The value is: " + i);
        }
    }

    private static void sumNumberFromLoop(int numberForSumUntil){
        int sum = 0;
        for(int x=1; x<=numberForSumUntil; x++){
            sum +=x;
        }
        System.out.println("SUM " + sum);
    }

    private static void sumNumbersFromOneToN(int n) {
        int numOne = 1;
        int sum = 1;

        while (numOne < n) {
            numOne++;
            sum += numOne;
        }
        System.out.println("The SUM is: " + sum);
    }

    private static void calculateFactorial(int number) {
        long factorial = 1;
        System.out.println("Initial number for calculation: " + number);
        while (true) {
            if (number == 1 || number == 0) {
                break;
            }
            factorial *= number;
            number--;
        }
        System.out.println("n! = " + factorial);
    }

    private static void calculateFactorialDoWhile(int number) {
        long factorial = 1;
        System.out.println("Initial number for calculation: " + number);
        do {
            factorial *= number;
            number--;
        } while (number > 0);
        System.out.println("n! = " + factorial);
    }
}
