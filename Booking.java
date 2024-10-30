import java.util.List;

public class Booking {
    private String bookingId;
    private Payment payment;
    private Ticket ticket;
    private Theatre theatre;
    public Booking(String bookingId){
     this.bookingId=bookingId;
    }

    public List<Seats> checkAvailableSeats(String screenId, String showId,){
        theatre.getScreen(screenId).getAvailableSeats();
    }



}
