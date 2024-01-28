
public class NegativePaymentException extends RuntimeException {
    public NegativePaymentException(double amount) 
    {
        super(amount + " is negative!\nYou cannot pay a negative amount");
    }

}
