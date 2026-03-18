/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dsa.ca1;

/**
 *
 * @author Olivier Nowak
 */
public interface queueInterface {
    void enqueue(Object item);
    Object dequeue();
    public int size();
    boolean isEmpty();
    boolean contains(Object item);
    String displayQueue();        // return a string representation
}
