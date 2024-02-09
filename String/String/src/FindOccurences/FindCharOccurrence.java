package FindOccurences;

public class FindCharOccurrence {
        public int numberOfTimesFound(String str,char ch)
        {
            int count=0;
            char[] arr = str.toCharArray();
            int arrayLength = str.length();
            for (int i = 0; i < arrayLength; i++) {
                if (arr[i] == ch) {
                    count++;
                }
            }
           return count;
        }

}
