import java.util.Date;
import java.util.List;

public class Show {
    private  String showId;
    private Date startTime;
    private Date endTime;
    private ShowName showName;
    private Screen screen;
    private Movie movie;
    private List<Seats> seatsList;

    public Show(String showId,Date startTime,Date endTime){
        this.showId=showId;
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public List<Seats> getSeatsList() {
        return seatsList;
    }

    public String getMovieName(){
        return movie.getMovieName();
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public ShowName getShowName() {
        return showName;
    }

    public String getShowId() {
        return showId;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setShowName(ShowName showName) {
        this.showName = showName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
