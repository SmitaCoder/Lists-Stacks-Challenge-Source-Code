package academy.learnprogramming.stackschallenge;

import java.util.EmptyStackException;

public class StackImpl {
    private char[] stack;
    private int top;

    public StackImpl(int capacity){
        stack = new char[capacity];
    }

    public void push(char c){
        if(top == stack.length){
            char[] newCharArray = new char[2*stack.length];
            System.arraycopy(stack,0,newCharArray,0,stack.length);
            stack = newCharArray;
        }
        stack[top++]=c;
    }

    public char pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        char c = stack[--top];
        stack[top]='\0';
        return c;
    }

    public boolean isEmpty(){
        if(top == stack.length)
            return true;
        else
            return false;
    }

    public int getSize(){
        return top;
    }
}
