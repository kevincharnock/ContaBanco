package BankAccounts;

import BankAccounts.TypeOfPayments.TypeToPayment;

import java.time.LocalDateTime;

public class PaymentAccount extends BankAccount{

    private LocalDateTime deadLineDate;
    private String description;
    private TypeToPayment valueToPay;

}
