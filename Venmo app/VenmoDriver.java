import java.util.Scanner;

public class VenmoDriver {

	public static void main(String[] args) throws NegativePaymentException {
		double amount = 0;
		char again = 'y';
		Venmo transaction = new Venmo();
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Enter your Venmo transaction");
			amount = scan.nextDouble();

			if (transaction.pay(amount)) {
				System.out.println(transaction);
			}				


			System.out.println("Another transaction (Y/N)?");
			again = scan.next().charAt(0);
	   }while (again == 'y' || again == 'Y');
	}

}
