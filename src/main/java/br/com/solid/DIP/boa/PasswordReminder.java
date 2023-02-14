package br.com.solid.DIP.boa;

public class PasswordReminder {

    private DBConnectionInterface dbConnection;

    public void __construct(DBConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }
}
