package Clients;

import Entities.CodeEntitie;

public class User extends CodeEntitie {

    private String clientName;
    private String login;
    private String password;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public String updatePassword(String password){
        password = this.password;
        return "Password updated";
    }


}
