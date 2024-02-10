package com.mtf;

import java.util.ArrayList;

public class GroceriesEntry {
    public static void main(String[] args) {
        ArrayList<Groceries> groceriesList = new ArrayList<>();
        groceriesList.add(new Groceries("Milk"));
        groceriesList.add(new Groceries("Eggs"));
        groceriesList.add(new Groceries("Butter", "Dairy", 5));
       // groceriesList.add(new Person(20, "Sakshi"));
        //groceriesList.add(10);


        for(Object g : groceriesList){
            Groceries groceries = (Groceries) g;
            System.out.println(groceries);
        }


    }
}
