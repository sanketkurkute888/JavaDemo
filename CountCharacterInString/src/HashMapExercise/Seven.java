package HashMapExercise;

import java.util.HashMap;

public class Seven
{
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("sanket", 1);
        hashMap.put("Raju", 2);
        hashMap.put("Magesh", 3);
        hashMap.put("Suresh", 4);
        hashMap.put("Alpesh", 5);
        hashMap.put("Ganesh", 6);

        System.out.println("The Orignal map"+hashMap);
        System.out.println("1. Is key Green Exists?");
        if(hashMap.containsKey("Alpesh"))
        {
            System.out.println("Yes - "+hashMap.get("Alpesh"));
        }
        else
        {
            System.out.println("No!");
        }
        System.out.println("\n2 Is key 'orange exists?'");
        if(hashMap.containsKey("Ganesh")){
            System.out.println("Yes - "+hashMap.get("Ganesh"));
        }
        else
        {
            System.out.println("No!");
        }
    }
}
