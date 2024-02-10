public class FlourPack {


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int sumOfKilos = 0;
        bigCount *= 5;
        sumOfKilos = bigCount +  smallCount;

        if(bigCount < 0 || smallCount < 0 || goal < 0 || sumOfKilos < goal) {

            return false;

        } else if(sumOfKilos == goal) {

            return true;

        }
        if(smallCount == 0){

            if(bigCount % goal == 0) {

                return true;

            }else {

                return false;

            }

        } else {

            if(bigCount > goal && bigCount % ) {

                return true;

            }else {

                return false;

            }

        }

    }

}
