package Domain;

public class RegistrationAddress {
    private String country;
    private String city;
    private String region;
    private Street street;

    public RegistrationAddress() {
    }

    public RegistrationAddress(String country, String city, String region, Street street) {
        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
