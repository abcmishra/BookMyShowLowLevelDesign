import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Screen {

    private  String screenId;

    private String screenName;

    List<Show> showList;
    List<Seats> seatsList;

    public Screen(String screenName,String screenId,List<Seats>seatsList){
        this.screenName=screenName;
        this.screenId=screenId;
        this.seatsList = new ArrayList<>();
    }


    public List<Seats> getAvailableSeats(){
        return  this.seatsList.stream().filter(seats -> seats.getSeatStatus()==SeatStatus.AVIALABLE).collect(Collectors.toList());

    }
    public  Screen getScreenById(String screenId){

    }
    public String getScreenName() {
        return screenName;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public String getScreenId() {
        return screenId;
    }
}
