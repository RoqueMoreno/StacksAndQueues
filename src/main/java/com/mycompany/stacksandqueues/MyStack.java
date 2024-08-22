
package com.mycompany.stacksandqueues;

public class MyStack<T> {
    private T[] stack;
    private int top;
    public MyStack(int size){
        stack = (T[]) new Object[size];
        top = -1;
    }
    
    public boolean isFull(){
        return (top == stack.length -1);   
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public void push(T data){
        if (isFull())
            return;
        top++;
        stack[top] = data;
        return;
    }
    public T pop(){
        if (isEmpty())
            return null;
        T data = stack[top];
        top--;
        return data;
    }
    public T peek(){
        if(isEmpty())
            return null;
        return stack[top];
    }
    
    
    
}
