package Covid19project.model.Data;

public class Address {

    private String streetName;
    private int streetNumber;
    private int postCode;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", postCode=" + postCode +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(String streetName, int streetNumber, int postCode, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
    }

    public Address() {
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
