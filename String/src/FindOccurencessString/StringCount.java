package FindOccurencessString;

public class StringCount {
    public void totalStringCount(String str, String word) {
        int count = 0;
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains(word)) {
                count++;
            }
        }
       System.out.println(count);

    }



}
