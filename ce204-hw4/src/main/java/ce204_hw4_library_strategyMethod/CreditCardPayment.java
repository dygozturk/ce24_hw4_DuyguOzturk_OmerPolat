package ce204_hw4_library_strategyMethod;

/**
 * The CreditCardPayment class represents a payment method using a credit card.
 */

public class CreditCardPayment implements PaymentStrategy{

	private String cardNumber;
    private String expirationDate;
    private String cvv;

    /**
     * Constructs a CreditCardPayment object with the specified card details.
     * 
     * @param cardNumber     the credit card number
     * @param expirationDate the expiration date of the credit card
     * @param cvv            the CVV number of the credit card
     */
    public CreditCardPayment(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    /**
     * Performs a payment transaction using the credit card.
     * 
     * @param amount the amount to be paid
     */
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying $" + amount + " with credit card: " + cardNumber);
	}
	
	

}
