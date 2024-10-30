import java.util.Date;

public class CreditCardProcessor implements PaymentProcessor{
    private String cardNumber;
    private String cardName;
    private String cvv;
    private Date expiryDate;
    public CreditCardProcessor(String cardName,String cardNumber,String cvv,Date expiryDate ){
        this.cardName=cardName;
    }
    @Override
    public void makePayment(String message){
        System.out.println("Payment made via crediCard");
    }
}
