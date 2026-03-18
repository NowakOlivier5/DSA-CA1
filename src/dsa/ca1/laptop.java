/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.ca1;

/**
 * based off of classwork and moodle example "SinglyLinkedListApp"
 * @author Olivier Nowak
 */
public class laptop {
    private Object element;
    private laptop next;
    private boolean available;

    public laptop(Object inElement, laptop inNode) {
        element = inElement;
        next = inNode;
        this.available = true; // available by default
    }

    public laptop getNext() {
        return next;
    }

    public void setNext(laptop inNode) {
        next = inNode;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        element = inElement;
    }
     public boolean getAvailable() {
    return available;
}

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return element.toString() + " | Available: " + available; //return id plus availability
    }
}

