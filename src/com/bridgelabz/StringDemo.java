package com.bridgelabz;

public class StringDemo {
    String str1 = ("BRIDGELABZ");
    String str2 = ("BRIDGELABZ");
    public void checkStringEqual() {
        if (str1==str2) {
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        stringDemo.checkStringEqual();

    }
}
