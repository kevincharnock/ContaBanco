package BankAccounts;

import Entities.CodeEntitie;
import java.time.LocalDateTime;


public class AccountReceive extends BankAccount {

    //Atributos Conta a receber
    private String description;
    private LocalDateTime date = LocalDateTime.now();
    private double valueToReceive;


    public double getValueToReceive() {
        return valueToReceive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
