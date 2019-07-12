package domain;

public class Address {
    private String country;
    private String county;
    private String city;
    private String streetName;
    private int streetNumber;
    private String postalCode;

    public Address(String country, String county, String city, String streetName, int streetNumber, String postalCode) {
        this.country = country;
        this.county = county;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
