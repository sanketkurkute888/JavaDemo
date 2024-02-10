package com.mtf;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(10);
//        linkedList.add(20);
//        linkedList.push(30);
//        linkedList.push(40);
//
//        System.out.println("Element"+ linkedList.peek());
//        linkedList.offer(50);
//        linkedList.poll();

       // System.out.println(linkedList);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //System.out.println(arrayList);
//        for(int i=0; i<arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }

//        for(Integer i : arrayList){
//            System.out.println(i);
//            //arrayList.add(60);
//        }

//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            //arrayList.add(60);
//            //arrayList.remove((Integer) 30);
//            //arrayList.set(1, 11);
//            int data = iterator.next();
//            if(data == 30)
//                iterator.remove();
//
//            System.out.println(data);
//        }

        Iterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            //listIterator.add(51);
            int data = listIterator.next();
            if(data == 30)
                listIterator.remove();
            System.out.println(data);
            //System.out.println(listIterator.next());
        }

//        System.out.println("Outside loop: "+listIterator.previous());
        System.out.println(arrayList);
    }
}
