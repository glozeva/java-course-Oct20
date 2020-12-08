package com.lectures.lecture14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CustomCalculateException {
        FileReader.readFile("fswd");
////        ScannerReader.readFromConsole();
//        calculate(5, 0);
    }

    private static int calculate(int a, int b) throws CustomCalculateException {
        try{
            return a/b;
        } catch (ArithmeticException ae){
            throw new CustomCalculateException("Devide by zero is not allowed");
        }
    }
}
