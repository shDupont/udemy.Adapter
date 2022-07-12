package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPago {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via mercadoPago");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via mercadoPago");
    }
}
