package ComparatorComparable;

import java.util.Comparator;
import java.util.Objects;

public class Country implements Comparable<Country> {
    int countryID;
    String name;

    public Country(int countryID,String name) {
        this.countryID = countryID;
        this.name=name;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryID == country.countryID && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryID, name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryID=" + countryID +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        Country country=(Country) o;
       return (this.countryID<country.countryID)?-1:(this.countryID>country.countryID)?1:0;
    }
}
