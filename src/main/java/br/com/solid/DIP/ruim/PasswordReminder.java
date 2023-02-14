package br.com.solid.DIP.ruim;

public class PasswordReminder<MySqlConnection> {

    private MySqlConnection dbConnection;

    public void __construct(MySqlConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
