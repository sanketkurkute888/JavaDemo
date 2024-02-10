import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {

//        FIRST EXAMPLE
//        String str="Th is";
//        System.out.println("Length "+str.length());
//        System.out.println("In character array "+str.toCharArray());
//        char[] arr=str.toCharArray();
//        String s=new String(arr);
//        System.out.println(s);
//        System.out.println("upper case "+str.toUpperCase());
//        System.out.println("upper case "+str.toLowerCase());
//        System.out.println(str.indexOf(s));


//        SECOND EXAMPLE
        String strDemo = "sanket  ";
        String str1 = "harry";
        System.out.println("String length :" + strDemo.length());
        System.out.println("String in lower case :" + strDemo.toLowerCase());
        System.out.println("Satring in in upper case " + strDemo.toUpperCase());
        System.out.println(strDemo.trim());
        System.out.println("Substring demo : " + strDemo.substring(3));
        System.out.println("Substring demo : " + str1.substring(1));
        System.out.println("Substring with start and end index :" + strDemo.substring(3, 4));
        System.out.println("Substring with start and end index :" + str1.substring(3, 5));
        System.out.println("replace demo in string " + str1.replace("r", "z"));
        System.out.println("start with demo" + str1.startsWith("ma"));
        System.out.println("end with demo" + str1.endsWith("ey"));
        System.out.println("specific position character in string :" + str1.charAt(4));
        System.out.println("Index of demo : " + str1.indexOf("re"));
        System.out.println("Last index of :"+str1.lastIndexOf("r"));
        System.out.println("Last index of :"+str1.lastIndexOf("r",3));
        System.out.println("equal to demo :"+str1.equals("Harry"));
        System.out.println("equal to demo :"+str1.equalsIgnoreCase("Harry"));

//        String a[]=str.split(" ");
//        String word="is";
//        int count=0;
//        {
//            for (int i = 0; i < a.length; i++) {
//                System.out.println(str.contains("is"));
//                if((str.contains(word)))
//                   count++;
//            }
//
//        }


        //backup
//        {
//            String a[]=str.split(" ");
//            int count=0;
//            for (int i = 0; i < a.length; i++) {
//                if(word.equals(a[i]))
//                    count++;
//            }
//            return count;
//        }

        String strdemo="myString";
        System.out.println(strdemo.length());
        System.out.println(strdemo.indexOf("y"));
        System.out.println(strdemo.charAt(5));
        System.out.println(strdemo.toLowerCase());
        System.out.println(strdemo.toUpperCase());
        System.out.println(strdemo.indexOf("n",7));
        System.out.println(strdemo.endsWith("ing"));


    }
}
