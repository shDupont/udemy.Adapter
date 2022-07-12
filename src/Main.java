import adapters.PayoneerAdapter;
import payoneer.Payoneer;
import paypal.IPaypalPayments;

public class Main {
    public static void main(String[] args) {
        IPaypalPayments payment = new PayoneerAdapter(new Payoneer());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}