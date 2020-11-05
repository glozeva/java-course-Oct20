package com.lectures.lecture06;

public class MainLecture06 {

    public static void main(String[] args) {
        checkYoungPeopleRights(21);
        getMonthNumberOfDays(1, 2016);

    }

    private static void getMonthNumberOfDays(int month, int year) {
        String monthName;
        int numberOfDays = 0;

        switch (month) {
            case 1:
                monthName = "January";
                numberOfDays = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                System.out.println("default case");
                monthName = "Unknown";

        }
        System.out.println("The month " + monthName + " has... " + numberOfDays + " ...number of days");
    }

    private static void checkYoungPeopleRights(int age) {
        boolean isAllowedToDrive = false;
        boolean hasRightsToDrink = false;
        boolean isAllowedToVote = false;

        if (age < 18) {
            System.out.println("Person is under 18, so nothing allowed");
        } else if (age >= 18 && age < 21) {
            isAllowedToDrive = true;
            isAllowedToVote = true;
        } else {
            isAllowedToDrive = true;
            isAllowedToVote = true;
            hasRightsToDrink = true;
        }

        System.out.println("isAllowedToDrive: " + isAllowedToDrive + " isAllowedToVote: " + isAllowedToVote + " hasRightsToDrink:" + hasRightsToDrink);
    }
}
