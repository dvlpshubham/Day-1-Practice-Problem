package com.bridgelabz;

public class DemonstrateStatic {
        static int a = 10;
        static int b;
        static void func(int c) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
        static {
            System.out.println("Running static initialization block.");
            b = a + 5;
        }
        public static void main(String args[]) {
            func(8);
        }
    }

