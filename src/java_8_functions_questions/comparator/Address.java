package java_8_functions_questions.comparator;

public class Address implements Comparable<Address> {
    private String streetName;
    private int pincode;

    public Address(String streetName, int pincode) {
        this.streetName = streetName;
        this.pincode = pincode;
    }

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
    public int compareTo(Address a) {
        return this.getPincode() - a.getPincode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
