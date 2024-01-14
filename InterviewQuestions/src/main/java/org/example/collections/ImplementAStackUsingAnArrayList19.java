package org.example.collections;
import java.util.ArrayList;
import java.util.EmptyStackException;
public class ImplementAStackUsingAnArrayList19<E> {




        private ArrayList<E> stack;


    public ImplementAStackUsingAnArrayList19(){
            stack = new ArrayList<>();
        }

        public void push(E element) {
            stack.add(element);
        }

        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.remove(stack.size() - 1);
        }

        public E peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public int size() {
            return stack.size();
        }

        public static void main(String[] args) {
            ImplementAStackUsingAnArrayList19<Integer> stack = new ImplementAStackUsingAnArrayList19<>();

            stack.push(5);
            stack.push(10);
            stack.push(15);

            System.out.println("Size of the stack: " + stack.size());
            System.out.println("Top element of the stack: " + stack.peek());

            while (!stack.isEmpty()) {
                System.out.println("Popped element: " + stack.pop());
            }

            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }




/*

Sure! Here's an implementation of a stack using an ArrayList in Java:



In this implementation:
- The `Stack` class uses an instance variable `stack` of type `ArrayList<E>` to store the elements of the stack.
- The `push` method adds an element to the top of the stack by appending it to the end of the ArrayList.
- The `pop` method removes and returns the top element of the stack. It throws an `EmptyStackException` if the stack is empty.
- The `peek` method returns the top element of the stack without removing it. It also throws an `EmptyStackException` if the stack is empty.
- The `isEmpty` method checks if the stack is empty by delegating to the `isEmpty` method of the ArrayList.
- The `size` method returns the number of elements in the stack by delegating to the `size` method of the ArrayList.
- In the `main` method, we demonstrate the usage of the stack by pushing elements onto it, retrieving the size and top element, and popping elements until the stack is empty.

This implementation provides basic stack operations (push, pop, peek) using an ArrayList as the underlying data structure.

 */