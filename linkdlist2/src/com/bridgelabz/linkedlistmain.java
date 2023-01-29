package com.bridgelabz;

public class linkedlistmain {
    public static void main(String[] args) {
        linkedlist linkedlist1=new linkedlist();
        linkedlist1.push(40);
        linkedlist1.push(20);
        linkedlist1.push(30);
        linkedlist1.push(10);
        linkedlist1.dispaly();
        Integer popdata= (Integer) linkedlist1.pop();
        System.out.println("the popdata is "+popdata);
        linkedlist1.dispaly();
        Integer poplast= (Integer) linkedlist1.poplast();
        System.out.println("the poplast data"+poplast);


        linkedlist linkedlist2=new linkedlist();
        linkedlist2.append(56);
        linkedlist2.append(66);
        linkedlist2.append(78);
        linkedlist2.append(88);
        linkedlist2.append(90);
        linkedlist2.dispaly();



    }
}
