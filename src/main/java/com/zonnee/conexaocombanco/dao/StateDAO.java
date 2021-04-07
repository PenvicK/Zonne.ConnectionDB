package com.zonnee.conexaocombanco.dao;

import com.zonnee.conexaocombanco.factory.ConnectionFactory;
import com.zonnee.conexaocombanco.model.State;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateDAO {
    private Connection connection;

    public StateDAO(){
        this.connection = new ConnectionFactory().getConnection();
        this.createTableState();
    }
    public void createTableState() {
        String sql = "CREATE TABLE IF NOT EXISTS state (" +
                "idState INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(100) NOT NULL," +
                "prefix varchar(2) NOT NULL" +
                ");";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();
            stmt.close();

            System.out.println("Tabela State criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertStates(State state) {
        String sql = "INSERT INTO state" +
                " (idState, name, prefix) " +
                "VALUES (?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, state.getIdState());
            stmt.setString(2, state.getName());
            stmt.setString(3, state.getPrefix());

            stmt.execute();
            stmt.close();
            System.out.println("Informações inseridas!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void listStates() {
        String sql = "SELECT * FROM state";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet state = stmt.executeQuery();

            while (state.next()) {
                System.out.println(state.getInt("idState"));
                System.out.println(state.getString("name"));
                System.out.println(state.getString("prefix"));
                System.out.println("---------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
