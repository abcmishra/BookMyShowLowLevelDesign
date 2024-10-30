import java.util.List;

public class Theatre {
    private String theatreId;
    private String theatreName;
    private List<Screen>screenList;
    private  Address address;

    public Theatre(String theatreId,String theatreName){
        this.theatreId=theatreId;
        this.theatreName=theatreName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
}
