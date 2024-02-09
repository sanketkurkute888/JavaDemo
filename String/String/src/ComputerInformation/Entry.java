package ComputerInformation;

public class Entry {
    public static void main(String[] args) {
//        Product product=new Product(101,"laptop",45000);
//        System.out.println( product.toString());


        Motherbord motherbord=new Motherbord("v15");
        Monitor monitor=new Monitor("i7",5,190);
        ComputerCase computerCase=new ComputerCase("vivo","dell");
        PersonalComputer personalComputer=new PersonalComputer(101,"laptop",45600,600,"personalUse","hp",monitor,computerCase,motherbord);
        System.out.println(personalComputer.toString());
        personalComputer.personalComputerWorking();
    }

}
