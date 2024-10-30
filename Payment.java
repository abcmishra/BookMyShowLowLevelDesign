import java.util.Map;

public class Payment{
    private String paymentId;
    private PaymentStatus paymentStatus;
    private int totalAmt;
    private PaymentStrategy paymentStrategy;
    private Ticket ticket;
    Map<Booking,>

    public Payment(String paymentId,int totalAmt){
        this.paymentId=paymentId;
        this.totalAmt=totalAmt;
    }

   public boolean isPaymentDone()



    public void setPaymentId(String paymentId){
        this.paymentId=paymentId;
    }
    public String getPaymentId(){
        return this.paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public int getTotalAmt() {
        return totalAmt;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setTotalAmt(int totalAmt) {
        this.totalAmt = totalAmt;
    }
}
