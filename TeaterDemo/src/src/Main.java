

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Theatre theatre = new Theatre("REGENT", 8, 12);
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());


        boolean done = true;
        while (done) {
            System.out.println("\n****Welcome to REGENT theatre****\n");
            System.out.println("Choose any of the options to proceed");
            System.out.println("1: View Theatre Details \n2: View list of theatre seats along with price\n3: Reserve a seat\n4: Cancel your reservation\n5:Exit");
            int n = scan.nextInt();
            scan.nextLine();
            switch (n) {

                case 1:
                    System.out.println("Welcome to "+theatre.getTheatreName());
                    System.out.println("Rating : 4.6 ");
                    System.out.println("Architecture: Multiplex");break;
                case 2:
                    System.out.println("we have seats with price of Rs.200, Rs.300 and Rs.400 as below");
                    printList(priceSeats);
                    break;
                case 3:
                    System.out.println("Enter a seat you want to reserve");
                    String res=scan.nextLine();
                    if(theatre.reserveSeat(res)) {

                        System.out.println("Please pay for the seat");
                    }
                    else {
                        System.out.println("Sorry! The seat is unavailable");
                    }
                    break;
                case 4:
                    System.out.println("Enter the seat you want to cancel your reservation");
                    String can = scan.nextLine();
                    if (theatre.cancelSeat(can)) {
                        System.out.println("Done");
                    } else {
                        System.out.println("there was no reservation for this seat");
                    }
                    break;

                case 5:
                    System.out.println("***********exiting**********");
                    done = false;
                    break;

                default:
                    System.out.println("Please enter a valid option");
                    break;
            }

        }

    }









//        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
//        printList(priceSeats);


    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
}

