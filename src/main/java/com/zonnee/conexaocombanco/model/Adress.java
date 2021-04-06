package com.zonnee.conexaocombanco.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Adress {
    private int idAdress;
    private String street;
    private int number;
    private String district;
    private String city;
    private State state;
    private double cep;

    public String transformCep(double cep){
        String padrao = "00,000.000";
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('-');
        decimalFormatSymbols.setGroupingSeparator('-');
        DecimalFormat df = new DecimalFormat(padrao, decimalFormatSymbols);
        df.setGroupingSize(5);
        return df.format(cep);
    }

    public Adress(){

    }

    public Adress(int idAdress, String street, int number, String district, String city, State state, double cep){
        this.setIdAdress(idAdress);
        this.setStreet(street);
        this.setNumber(number);
        this.setDistrict(district);
        this.setCity(city);
        this.setState(state);
        this.setCep(cep);
    }

    public void statusAdress(){
        System.out.println("======================================");
        System.out.println("               Endereço               ");
        System.out.println("======================================");
        System.out.println("Id: " + this.getIdAdress());
        System.out.println("Rua: " + this.getStreet());
        System.out.println("Número: " + this.getNumber());
        System.out.println("Bairro: " + this.getDistrict());
        System.out.println("Cidade: " + this.getCity());
        System.out.println("Estado: " + this.state.getName());
        System.out.println("CEP: " + transformCep(this.getCep()));
        System.out.println("======================================");
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }
}
