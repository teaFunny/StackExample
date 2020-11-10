package com.teafunny;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        addValueAndPrintMax(stack,4);
        addValueAndPrintMax(stack,10);
        addValueAndPrintMax(stack,3);
        addValueAndPrintMax(stack,15);
        addValueAndPrintMax(stack,6);
        addValueAndPrintMax(stack,7);
        addValueAndPrintMax(stack,20);
    }

    private static void addValueAndPrintMax(Stack stack, int value) {
        stack.push(value);
        System.out.println(stack.getMaxValue());
    }
}
