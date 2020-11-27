package com.lectures.lecture11;

import com.lectures.lecture10.Person;
import com.lectures.lecture10.Product;

public class Employee extends Person {

    public static String lastName;
    public static double money2;

    public Employee(String name, double money) {
        super(name, money);
    }

    @Override
    public void buyProduct(Product product) {
        super.buyProduct(product);
    }

    //    public void createEmployee(){
//        Person person = new Person("Nadya", 1.0);
//    }
}
