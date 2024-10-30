import java.util.List;

public class Screen {
    private  String screenId;
    private String screenName;
    List<Show> showList;
    List<Seats> seatsList;

    public Screen(String screenName,String screenId){
        this.screenName=screenName;
        this.screenId=screenId;
    }

}
