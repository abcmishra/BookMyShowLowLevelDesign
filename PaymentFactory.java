public class PaymentFactory {
    public static PaymentProcessor getPaymentProcessor(String type){
        switch (type){
            case "CreditCard":
                return new CreditCardProcessor("shhshsh","54554","677",);
            case "DebitCard":
                return new DebitCardProcessor();
            case "UPI":
                return new UPIProcessor();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }


    }
}

