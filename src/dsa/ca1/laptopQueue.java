/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.ca1;

/**
 * using HamiltonClinic from moodle
 * @author Olivier Nowak
 */
import java.util.ArrayList;

public class laptopQueue implements queueInterface {

    private ArrayList<String> queue;

    public laptopQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(Object item) {
        queue.add((String) item);   // add at end
    }

    @Override
    public Object dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);  // remove first
        }
        return null;
    }
    
    @Override
    public int size() {
        return queue.size();
    }
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object item) {
        return queue.contains(item);
    }

    @Override
    public String displayQueue() {
        if(queue.isEmpty()) return "No laptops in queue.";
        StringBuilder sb = new StringBuilder();
        for(String s : queue){
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}
