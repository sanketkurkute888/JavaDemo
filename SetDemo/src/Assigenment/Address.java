package Assigenment;

import java.util.Objects;

public class Address {
    String streetName;
    int pincode;

    public Address(String streetName, int pincode) {
        this.streetName = streetName;
        this.pincode = pincode;
    }

//

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", pincode=" + pincode +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Address address = (Address) o;
//        return pincode == address.pincode && Objects.equals(streetName, address.streetName);
//    }

    public boolean equals(Object obj) {
        if(obj instanceof Address address) {
            return streetName.equals(address.getStreetName()) && pincode == address.getPincode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int temp= Objects.hash(streetName, pincode);
        System.out.println(temp);
        return temp;
    }
}
