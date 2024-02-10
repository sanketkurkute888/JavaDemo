package Assigenment;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
      if (o1.getName().equals(o2.getName()))
      {
          return 1;
      }
      return 0;
    }

}
