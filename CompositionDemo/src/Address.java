public class Address {
    private int flatNo;
    private String street;
    private int pinCode;
    private String city;

    public Address(int flatNo, String street, int pinCode, String city) {
        this.flatNo = flatNo;
        this.street = street;
        this.pinCode = pinCode;
        this.city = city;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean validatePincode(){
        return pinCode > 0;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", street='" + street + '\'' +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                '}';
    }
}
