package com.bridgelabz;

public class linkedlist<Y> {
    private Node1<Y> head;
    private Node1<Y> tail;

    void push(Y VALUE) {
        Node1<Y> newnode = new Node1<>(VALUE);
        if (head == null) {
            head=newnode;
            tail=newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }

    }
    void append(Y value){
        Node1<Y> newnode = new Node1<>(value);
        if(head==null){
           head=newnode;
           tail=newnode;

        }else{
            tail.next=newnode;
            tail=newnode;

        }




    }
    Y pop(){
       if(head ==null){
           return null;

       }else{
           Y popdata= head.data;
             head=head.next;
             return popdata;
       }
    }
    Y poplast(){
      if(head==null)
          return null;
      Y poplast= tail.data;
      Node1<Y> temp= head;
      while (temp!=tail){
          temp=temp.next;
      }
      tail=temp;
      temp.next=null;
      return poplast;


    }
    


    void dispaly() {
        Node1<Y> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println();


    }
}