package com.zonnee.conexaocombanco.model;

import java.time.LocalDateTime;

public class User {
    private String email;
    private String password;
    private boolean stateLogin;
    private LocalDateTime dateTimeLogin;

    public User(String email, String password, boolean stateLogin, LocalDateTime dateTimeLogin){
        this.setEmail(email);
        this.setPassword(password);
        this.setStateLogin(stateLogin);
        this.setDateTimeLogin(dateTimeLogin);
    }

    public User(){

    }

    public void statusUser(){
        System.out.println("======================================");
        System.out.println("                 User                 ");
        System.out.println("======================================");
        System.out.println("Email: " + this.getEmail());
        System.out.println("Senha: " + this.getPassword());
        System.out.println("Logado: " + this.isStateLogin());
        System.out.println("Date Login: " + this.getDateTimeLogin());
        System.out.println("======================================");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStateLogin() {
        return stateLogin;
    }

    public void setStateLogin(boolean stateLogin) {
        this.stateLogin = stateLogin;
    }

    public LocalDateTime getDateTimeLogin() {
        return dateTimeLogin;
    }

    public void setDateTimeLogin(LocalDateTime dateTimeLogin) {
        this.dateTimeLogin = dateTimeLogin;
    }
}
