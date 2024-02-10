public class BreakAndContinue {
    public static void main(String[] args) {
//        for(int i=1; i<=10; i++){
//            if(i == 5) {
//                i--;
//                continue;
//            }
//            System.out.println("Hello "+ i);
//
//        }

        int i=1;
        while(i <= 10){
            if(i == 5) {
                continue;
            }
            System.out.println("Hello "+ i);
            i++;
        }
        System.out.println("End");
    }
}
