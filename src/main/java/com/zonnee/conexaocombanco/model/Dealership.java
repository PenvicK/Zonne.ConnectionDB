package com.zonnee.conexaocombanco.model;

public class Dealership {
    private int idDealership;
    private String name;
    private State state;

    public Dealership(int idDealership, String name, State state){
        this.setIdDealership(idDealership);
        this.setName(name);
        this.setState(state);
    }

    public Dealership(){

    }

    public void statusDealership(){
        System.out.println("======================================");
        System.out.println("            Concessionária            ");
        System.out.println("======================================");
        System.out.println("Id: " + this.getIdDealership());
        System.out.println("Nome: " + this.getName());
        System.out.println("Estado: " + this.state.getName());
        System.out.println("======================================");
    }

    public int getIdDealership() {
        return idDealership;
    }

    public void setIdDealership(int idDealership) {
        this.idDealership = idDealership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
