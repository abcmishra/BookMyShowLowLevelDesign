public class Address {
    private String cityName;
    private Long zipcode;
    private String streetName;
    private String stateName;

    public Address(String cityName,Long zipcode,String streetName,String stateName){
        this.cityName=cityName;
        this.zipcode=zipcode;
        this.stateName=stateName;
        this.stateName=stateName;

    }

    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

}
