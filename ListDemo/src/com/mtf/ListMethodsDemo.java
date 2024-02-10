package com.mtf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListMethodsDemo {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Eggs");
        groceries.add("Butter");

        System.out.println(groceries);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Oranges");
        fruits.add("Kiwi");

        groceries.addAll(fruits);
        System.out.println(groceries);

        groceries.remove("Butter");
        System.out.println(groceries);

        List<String> vegetables = List.of("Potato", "Spinach", "Onion");
        //vegetables.add("Tomato");
        //vegetables.set(0, "Tomato");
        //groceries.addAll(3, vegetables);
        //vegetables.remove("Potato");
        System.out.println(vegetables);
//        groceries.remove("Potato");
//        System.out.println(groceries);

        List<String> newList = new ArrayList<>(vegetables);
        System.out.println(newList);
        newList.add("Tomato");
        System.out.println(newList);

        System.out.println(groceries);
        if(groceries.contains("Butter")){
            System.out.println("Already purchased");
        }

        groceries.add("Apple");
        System.out.println(groceries);

        System.out.println(groceries.indexOf("Apple"));
        System.out.println(groceries.lastIndexOf("Apple"));

        List<String> stationary = Arrays.asList("Pen", "Pencil", "Notebook");
        System.out.println(stationary);
        stationary.set(0, "Eraser");
       // stationary.add("Eraser");
        System.out.println(stationary);

        groceries.addAll(stationary);
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);


        //groceries.removeAll(stationary);
       /* groceries.retainAll(stationary);
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());*/

        String[] strGroceries = new String[groceries.size()];

        groceries.toArray(strGroceries);
        System.out.println(Arrays.toString(strGroceries));

    }
}
