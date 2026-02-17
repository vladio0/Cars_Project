package Documents;

public class mvsOffice {
private String name;
    private String region;
    private String city;
    private String street;
    private boolean is_active;

    public mvsOffice(String name, String region, String city, String address, boolean is_active) {
        this.name = name;
        this.region = region;
        this.city = city;
        this.street = address;
        this.is_active = is_active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
