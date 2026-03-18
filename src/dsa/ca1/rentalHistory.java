/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.ca1;

import java.util.ArrayList;

/**
 * stack based on TrainApp from moodle 
 * @author Olivier Nowak
 */
public class rentalHistory implements stackInterface{
    private ArrayList<String> historyStack;

    public rentalHistory() {
        historyStack = new ArrayList<String>();
    }

    public void push(Object newItem) {
        historyStack.add(0, (String) newItem);
    }

    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (historyStack.isEmpty()) {
            sMessage = sMessage.concat("No history");
        } else {
            for (iCount = 0; iCount < historyStack.size(); iCount++) {
                sMessage = sMessage.concat(historyStack.get(iCount));
                sMessage = sMessage.concat("; ");
            }
        }
        return sMessage;
    }
}
