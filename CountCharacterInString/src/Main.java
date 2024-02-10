import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        countChars(str);

    }
    public static void countChars(String str){
        SortedMap<Character, Integer> map = new TreeMap<>();
        char[] charArray = str.toCharArray();
        int count;
        for (int i=0; i<charArray.length;i++){

            if (map.containsKey(charArray[i])){
                count = map.get(charArray[i]);
                map.put(charArray[i], ++count);
            }
            else {
                map.put(charArray[i],1);
            }
        }
//        Collections.sort;
        System.out.println(map);

    }

}