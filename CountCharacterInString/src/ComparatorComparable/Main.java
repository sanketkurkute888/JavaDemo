package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //    create the  objects of the Country class
        List<Country> countryList = new ArrayList<>();

//   add to the list
        countryList.add(new Country(1,"India"));
        countryList.add(new Country(2,"Nepal"));
        countryList.add(new Country(3,"Bhutan"));
        countryList.add(new Country(4,"China"));
        countryList.add(new Country(5,"malesiya"));

//        sort the list by country name

        Collections.sort(countryList, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


}
