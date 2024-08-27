package Tests;

import BankAccounts.TypeOfPayments.Pix.Pix;
import BankAccounts.TypeOfPayments.TypeToPayment;

public class PixTest {

    public static void main(String[] args) {

        TypeToPayment typeToPayment = new TypeToPayment();
        typeToPayment.setValue(20);
        Pix pix = new Pix();

        pix.PayWithPix(typeToPayment);



    }

}
