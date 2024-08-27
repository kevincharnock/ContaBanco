package BankAccounts;

import Clients.User;
import Entities.CodeEntitie;

public class BankAccount extends CodeEntitie {

    //Atributos da conta
    private User user;
    protected double balanceAccount;


    //Métodos da conta
    public void getBalance(){
        System.out.println(this.balanceAccount);

    }

    //TODO: IMPLEMENTAR METODO HISTORICO


}
