/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.ca1;

/**
 * based off of classwork and moodle example "SinglyLinkedListApp"
 * @author Olivier Nowak
 */
public class laptopList {

    private laptop head;
    private int iSize;
    private laptop currNode;
    private laptop prevNode;

    public laptopList() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return iSize;
    }

    public void add(int iPosition, Object theElement) {
        if (iPosition == 1) {
            laptop newNode = new laptop(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            laptop newNode = new laptop(theElement, currNode);
            prevNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    public void add(Object theElement) {
        laptop newNode = new laptop(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }

    public void remove(int iPosition) {
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        iSize = iSize - 1;
    }

    private void setCurrent(int iPosition) {
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }
                                
    public void printList() {
        laptop tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}