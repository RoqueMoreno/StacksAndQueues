package com.mycompany.stacksandqueues;
public class StackTester {
 
   
    public StackTester(){}
    //invert a string
    public String invertString(String myString){
        
        MyStack stack = new MyStack(myString.length());
        for (int i = 0;i < myString.length(); i++) {
            stack.push(myString.charAt(i));
        }
        String returnString = "Inverted String: ";
        while (!stack.isEmpty()){
            returnString += stack.pop();
        }
        return returnString;
    }
    
    //test parity
    public boolean testParity(String myString){
        MyStack stack = new MyStack<String>((myString.length()/2) +1);
        for (int i = 0; i < myString.length(); i++) {
            switch (myString.charAt(i)){
                case '{':
                    stack.push(myString.charAt(i));
                    break;
                case '[':
                    stack.push(myString.charAt(i));
                    break;
                case '(':
                    stack.push(myString.charAt(i));
                    break;
                case '}':
                    if(stack.isEmpty()){
                        System.out.println("Closing ] without a corresponding [");
                        return false;
                    }
                    if(!stack.pop().equals('{')){
                        System.out.println("Expected }");
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        System.out.println("Closing ] without a corresponding [");
                        return false;
                    }
                    if(!stack.pop().equals('[')){
                        System.out.println("Expected ]");
                        return false;
                    }
                    break;
                case ')':
                    if(stack.isEmpty()){
                        System.out.println("Closing ] without a corresponding [");
                        return false;
                    }
                    if(!stack.pop().equals('(')){
                        System.out.println("Expected )");
                        return false;
                    }
                    break;
            }
            
        }
        if(!stack.isEmpty()){
            System.out.println("Disparity exception");
            return false;
        }
        return true;
    } 
    
    public double[] sortArray(double[] o){
        MyStack<Double> valueStack = new MyStack<Double>(o.length);
        double[] returnArray = new double[o.length];
        boolean[] seenNumbers = new boolean[o.length];
        for (int i = 0; i < o.length; i++) {
            seenNumbers[i] = false;
        }
        double largestValue = o[0];
        int largestValueIndex = 0;
        for (int i = 0; i < o.length; i++) {
            //set the largest value to a non seen number
            for (int j = 0; j < o.length; j++) {
                if(!seenNumbers[j])
                    largestValue = o[j];
            }
            //System.out.println("compare to value set to " + largestValue);
            //find the largest value
            for (int j = 0; j < o.length; j++) {
                if(largestValue <= o[j] && !seenNumbers[j] ){
                    largestValueIndex = j;
                    largestValue = o[j];
                    //System.out.println("Largest non seen value " + largestValue + " at " + j);
                }
            }
            seenNumbers[largestValueIndex] = true;
            valueStack.push(largestValue);
            //set the largest number equal to null
            
        }
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = valueStack.pop();
            System.out.println("" + returnArray[i]);
        }
        
        //sort small to large
        return returnArray;
    }
    
    
}
