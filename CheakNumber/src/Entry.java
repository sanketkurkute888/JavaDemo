public class Entry {
    public static void main(String[] args) {
        NumberCheak number=new NumberCheak();
        int value=number.checkNumber(0);
        if(value==1)
        {
            System.out.println("positive");
        }
       else if(value==-1)
        {
            System.out.println("negative");
        }
        else if(value==0)
        {
            System.out.println("zero");
        }
    }
}