package com.lectures.lecture14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileReader {

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null) {
                log.info(tmp);
            }

        } catch (FileNotFoundException fnfe) {
            log.error("The file {} does not exist! Unable to read it", fileName);
//            fnfe.printStackTrace();
        } finally {
            log.info("Clearing reader stream");
            if (bufferedReader != null) {
                bufferedReader.close();
            }

            log.info("Clearing file input stream");
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
