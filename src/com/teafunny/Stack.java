package com.teafunny;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Element> elements = new LinkedList<>();

    public void push(int i) {
        int maxValue = Integer.MIN_VALUE;
        if (!elements.isEmpty()) {
            maxValue = elements.getLast().getMaxValue();
        }
        if (i > maxValue) {
            maxValue = i;
        }
        elements.addLast(new Element(i, maxValue));
    }

    public int getMaxValue() {
        return elements.getLast().getMaxValue();
    }

    public int pop() {
        return elements.removeLast().getValue();
    }


}
