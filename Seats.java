import java.util.ArrayList;
import java.util.List;

public class Seats {
    private String seatId;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private List<String> seatList;

    public Seats(String seatId){
        this.seatId=seatId;
        this.seatList= new ArrayList<>();
    }

    public boolean bookSeats(String seatId){
        if(!seatList.contains(seatId)){
            seatList.add(seatId);
            return true;
        } else {
            System.out.println("Seat is already booked");
        }
        return false;
    }








}
