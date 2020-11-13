package com.lectures.homeworks;

public class Homework05 {
    // instance variable with name string01 of reference type String
    String string01 = "This is Test!";
    /*
    Reference string01 is Stack memory --> pointing to heap memory in String pool
    that contains literal This is Test!
     */

    public static void main(String[] args) {
        Homework05 homework = new Homework05();
        // 1
        homework.replaceString();

        // 2
        System.out.println(homework.areStringsEqual(homework.string01, "This is Test!"));

        // 3
        System.out.println("Number of string words is: " + homework.getStringPartsCount());

        // 4
        homework.concatStrings("String1", "String2");

        // 5
        homework.getStringChar(0);
        homework.getStringChar(1);
        homework.getStringChar(4);

    }

    /*
     * 1. Заместете даден под-string в даден string с друг текст:
     * Пример: “My name is Test” – заместете Test с нещо, което чете от конзолата
     *
     * 2. Сравнете 2 стринга дали са еднакви
     *
     * 3. Пребройте колко думи има в един стринг (разделете текста по space)
     *
     * 4. Обединете 2 и повече стринга в един и го изпишете в конзолата
     */
    private void replaceString() {
        System.out.println("Initial String: " + string01);
        String string02 = string01.replace("Test", "my dog");
        System.out.println("String after replacement: " + string02);

    }

    private boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    private int getStringPartsCount() {
        String[] stringParts = string01.split(" ");
        System.out.println(stringParts[1]);
        return stringParts.length;
    }

    private void concatStrings(String str1, String str2) {
        System.out.println(str1.concat(str2));
    }

    private void getStringChar(int charIndex){
        String hello = "Hello You!";
        /*
        |H|e|l|l|o| |Y|o|u|!| -> memory representation
        |0|1|2|3|4|5|6|7|8|9| -- indexes in the memory
         */
        System.out.println(hello.charAt(charIndex));
    }



}
