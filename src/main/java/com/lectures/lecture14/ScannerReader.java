package com.lectures.lecture14;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScannerReader {

    public static void readFromConsole(){
        String string = new Scanner(System.in).nextLine();
        try {
            int i = Integer.parseInt(string);
            log.info("You entered a valid integer number: " + i);
        } catch (NumberFormatException nfe){
            log.error("The entered string is not a valid number", nfe);
            throw new RuntimeException(nfe);
        }
    }
}
