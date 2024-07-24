package org.example;

public class Main {
    public static void main(String[] args) {

        MyStack list = new MyStack();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        System.out.println("list.size() = " + list.size());
        list.display();
        System.out.println("list.pop() = " + list.pop());
//        list.remove(4);
        list.display();
        System.out.println("list.size() = " + list.size());
        System.out.println("list.pop() = " + list.pop());
        System.out.println("list.peek() = " + list.peek());
        list.push("00");
        list.display();
        list.clear();
        System.out.println("list.size() = " + list.size());

    }
}