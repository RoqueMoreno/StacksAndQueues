/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stacksandqueues;

/**
 *
 * @author roque
 */
public class StacksAndQueues {

    public static void main(String[] args) {
        StackTester test = new StackTester();
        System.out.println("hello");
        System.out.println(test.invertString("hello"));
        
        String myString = "[[]]{{}}(())";
        System.out.println(myString);
        System.out.println(test.testParity(myString));
        myString += "]";
        System.out.println(myString);
        System.out.println(test.testParity(myString));
        
        double[] myArray = {1,2.3,4.5,6,10.2, 2, 5.3};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("Sorting array...");
        test.sortArray(myArray);
    }
}
