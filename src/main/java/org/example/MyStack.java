package org.example;

public class MyStack {

    private Node nods;
    private int size;

    private  static class Node{
        Object value;
        Node next;

        Node(Object value){
            this.value = value;
            this.next = null;
        }
    }
/*    public void push(Object value){//додає елемент в кінець
        Node newNode = new Node(value);
        if(nods == null){
            nods = newNode;
        }else{
            Node current = nods;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }*/
public void push(Object value){//додає елемент в початок
    Node newNode = new Node(value);
    if(nods == null){
        nods = newNode;
    }else{
        newNode.next = nods;
        nods = newNode;
    }
    size++;
}
   public void remove(int index){//видаляє елемент за індексом
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Неправильний індекс");
        }
        Node current = nods;
        if(index == 0){
            nods = nods.next;
        }else{
       for (int i = 0; i < index - 1; i++) {
           current = current.next;
       }
       current.next = current.next.next;
        }
        size--;
   }
   public void clear(){//очищає колекцію
        nods = null;
        size = 0;
   }
   public int size(){//повертає розмір колекції
        return size;
   }
   public Object peek(){//повертає перший елемент стеку
        return nods.value;
   }
   public Object pop(){//повертає перший елемент стеку та видаляє його з колекції
       Object result = this.peek();
       nods = nods.next;
       size--;
       return result;
   }
    public void display(){
        Node current = nods;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
