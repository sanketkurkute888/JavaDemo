import java.util.*;

public class demo {
    public static void main(String[] args) {
//        Set<Integer> integerSet=new LinkedHashSet<>();
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(3);
//        integerSet.add(3);
//        integerSet.add(5);
//        integerSet.add(7);
//        integerSet.add(6);
//        integerSet.add(null);
//        integerSet.add(null);
//
//        Iterator itr=integerSet.iterator();
//
//         while (itr.hasNext())
//          {
//              System.out.println(itr.next());
//          }

//        Set<String> names=new TreeSet<>();
//        names.add("sanket");
//        names.add("sanket");
//        names.add("sakshi");
//        names.add("resham");
//        names.add("divya");
//        names.add("kranti");
//        names.add("vijaya");
//        names.add("divyalata");
//
//        Iterator itr=names.iterator();
//
//         while (itr.hasNext())
//          {
//              System.out.println(itr.next());
//          }


//        String str="hello";
//        int i=Integer.parseInt(str);

//        int a=10;
//        int b=0;
//        System.out.println(a/b);


//
//         String str=null;
//         System.out.println(str.length());
//
//         int arr[]=new int [5];
//
//         arr[6]=20;


       int a=50;
       int b=0;
         try {
            int arr[]=new int [5];
            arr[10]=10;

         }
         catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println(e);
         }

        System.out.println("Some code after exception");

    }
}
