package com.lectures.lecture07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainLecture07 {

    public static void main(String[] args) {
        ArrayListExamples arrayListExamples = new ArrayListExamples();
//        arrayListExamples.getCompanyOffices();
//        arrayListExamples.addNewOffice();
//        arrayListExamples.changeOfficeName();
//        arrayListExamples.removeOffice();
//        arrayListExamples.getOfficesCount();
//        arrayListExamples.sortOffice();
//        arrayListExamples.getOfficeByIndex(0);

//        Stack<String> stack = new Stack<String>();
//        stack.push("1. Sofia");
//        stack.push("2. Berlin");
//        stack.push("3. Varna");
//        System.out.println("Peek: " + stack.peek());
//        while(stack.size()>0){
//            String city = stack.pop();
//            System.out.println(city);
//        }

        Queue<String> queue = new LinkedList<String>();
        queue.offer("1. Sofia");
        queue.offer("2. Plovdiv");
        queue.offer("3. Varna");
        while(queue.size()>0){
            String city = queue.poll();
            System.out.println(city);
        }

    }
}
