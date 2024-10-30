import java.util.ArrayList;
import java.util.List;

public class Seats {
    private String seatId;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private int price;


    public Seats(String seatId,int price){
        this.seatId=seatId;
        this.price=price;

    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }
}
