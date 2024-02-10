public class DuplexPrinter {
           public  int pageCountDuplexPrinter(boolean duplex, int totalPagesForPrinting) {
               if (totalPagesForPrinting < 0) {
                   return -1;
               } else {
                   if (duplex) {
//                   if(totalPagesForPrinting%2==0)
//                       System.out.println(totalPagesForPrinting / 2);
//                   else System.out.println((totalPagesForPrinting / 2) + (totalPagesForPrinting % 2));
                       return ((totalPagesForPrinting % 2 == 0) ? (totalPagesForPrinting / 2) : ((totalPagesForPrinting / 2) + (totalPagesForPrinting % 2)));

                   }
//               else System.out.println(totalPagesForPrinting);
                   return (totalPagesForPrinting);
               }
           }

}
