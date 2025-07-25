package deva.java;
import java.util.*;
public class stackdsa {
    int maxSize;
     int[] stack;
   int top;
 public stackdsa(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; 
    }
 public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; 
        } else {
            return stack[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    
    public boolean isEmpty() {
        return top == -1;
    }
	
	public static void main(String args[]) {
		stackdsa stack=new stackdsa(10);
		stack.push(10);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
