package com.zonnee.conexaocombanco.model;

public class State {
    private int idState;
    private String name;
    private String prefix;

    public State(){

    }

    public State(int idState, String name, String prefix){
        this.setIdState(idState);
        this.setName(name);
        this.setPrefix(prefix);
    }

    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void statusState(){
        System.out.println("======================================");
        System.out.println("                 Estado               ");
        System.out.println("======================================");
        System.out.println("ID: " + this.getIdState());
        System.out.println("Nome: " + this.getName());
        System.out.println("Prefixo: " + this.getPrefix());
        System.out.println("======================================");
    }
}
