import java.util.List;
import java.util.Map;

public class Theatre {
    private String theatreId;
    private String theatreName;
    private  Address address;
    private List<Screen>screenList;

    public Theatre(String theatreId,String theatreName){
        this.theatreId=theatreId;
        this.theatreName=theatreName;
    }

    public void displayShows(){
        for(Screen screen:screenList){
            System.out.println("Screen "+screen.getScreenName());
            for(Show show:screen.getShowList()){
                System.out.println("ShowName "+show.getMovieName()+"Start_time "+show.getStartTime() + "End time " +show.getEndTime());
            }
        }
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

    public Screen getScreen(String screenId) {
        return getScreenList().stream()
                .filter(screen -> screen.getScreenId().equals(screenId)) // Assuming getId() returns the ID of the Screen
                .findFirst() // Get the first match (if any)
                .orElse(null); // Return null if no match found
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
