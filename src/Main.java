import adapters.MercadoPagoAdapter;
import adapters.PayoneerAdapter;
import mercadopago.MercadoPago;
import payoneer.Payoneer;
import paypal.IPaypalPayments;

public class Main {
    public static void main(String[] args) {
        IPaypalPayments payment = new MercadoPagoAdapter(new MercadoPago());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}