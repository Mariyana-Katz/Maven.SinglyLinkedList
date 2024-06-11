package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    public class Node {
        T value;
        Node next;


        Node(T data, Node next) {
            this.value = data;
            this.next = next;

        }



//        public Node getNext() {
//            return next;
//        }
//
//        public T getData() {
//            return value;
//        }
//
//        public void setNext(Node next) {
//            this.next = next;
//        }
    }

    private Node head;
    private Node tail;
    int size;

    public SinglyLinkedList(){
        head  = null;
        tail = null;
        size  = 0;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
        }


    public void add(T valueToAdd){
      Node node = new Node(valueToAdd, null);

      if(isEmpty()){
          tail = node;
          head = tail;
      }
      else if(!isEmpty()){
          Node previous = tail;
          tail = node;
          previous.next = tail;

      }
        size++;
    }

    //Rest of the linked list methods
    public void Reverse() {
    }

    public void Slice() {
    }
}



//    String s = "hi";
//    int w = 3;
//    printStuff2((Integer)w);
//
//
//    ArrayList<Cat> catArrayList = new ArrayList<>();
//    Cat cat1 = new Cat();
//
//    catArrayList.add(cat1);
//
//    public void printStuff(String string){
//        System.out.println(string);
//    }
//
//
//
//    public <T> void printStuff2(T stuff extends Edible){
//        System.out.println(stuff);
//    }










