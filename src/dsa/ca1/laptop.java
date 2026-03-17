/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.ca1;

/**
 * based off of classwork and moodle example "SinglyLinkedListApp"
 * @author Olivier
 */
public class laptop {
        private Object element;
    private laptop next;

    public laptop(Object inElement, laptop inNode) {
        element = inElement;
        next = inNode;
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

    public String toString() {
        return element.toString();
    }
}

