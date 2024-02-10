public class EqualSumCheakerMain
{
    public static void main(String[] args) {
        //System.out.println("Hello World");
        EqualSumchecker sum=new EqualSumchecker();

        boolean Result=sum.hasEqualSum(1,1,3);
        if(Result==true)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
	 }
    }
}