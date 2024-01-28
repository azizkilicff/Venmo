import java.text.DecimalFormat;
public class Venmo {
    private double amount;      // Account balance
    DecimalFormat fmt = new DecimalFormat("0.00");
    /**
     This constructor sets the amount
     at 0.0.
     */

    public Venmo() {
        amount = 0.0;
    }

    /**
     This constructor sets the amount
     to the value passed as an argument.
     @param amount to be paid
     @exception NegativePaymentException when
     amount is negative.
     */

    public Venmo(double amount)  {
        if (amount < 0) {
            this.amount = 0;
            throw new NegativePaymentException(amount);
        }
        this.amount = amount;

    }

    public boolean pay(double amount) {
        if (amount < 0)
            throw new NegativePaymentException(amount);
        this.amount = amount;
        return true;
    }
    public String toString() {
        return "A payment of $" + amount + " has been made";
    }
}

