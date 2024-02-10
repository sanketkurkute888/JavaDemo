public class TeenNumbercheckerMain
{
    public static void main(String[] args) {

        TeenNumberchecker hasTeenNumber=new TeenNumberchecker();
        TeenNumberchecker isTeenNumber=new TeenNumberchecker();

        boolean Result=hasTeenNumber.hasTeen(22,23,34);
        if(Result==true)
        {
            System.out.println("has Teen number");
        }
        else
        {
            System.out.println("has Not the teen number");
        }

        boolean Result1=isTeenNumber.isTeen(19);
        if(Result1==true)
        {
            System.out.println("is Teen number");
        }
        else
        {
            System.out.println("is Not the teen number");
        }


    }
}