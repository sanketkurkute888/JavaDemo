package com.mtf;

import java.util.ArrayList;

public class Entry {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
       // arrayList.add("ABC");
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);

        arrayList.set(2, 80);
        System.out.println(arrayList);

        arrayList.add(4, 123);
        System.out.println(arrayList);

//        for(int i=0; i<arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }

//        for(Object data : arrayList){
//            System.out.println(":"+data);
//        }

    }
}
