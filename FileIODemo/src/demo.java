import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


class  demo
{
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(90);
        arrayList.add(70);

        Iterator itr= arrayList.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Comparator cmp= Collections.reverseOrder();
        Collections.sort(arrayList,cmp);

        itr= arrayList.iterator();

        System.out.println("*********");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
