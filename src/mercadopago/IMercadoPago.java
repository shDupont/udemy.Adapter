package mercadopago;

import utils.Token;

public interface IMercadoPago {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
