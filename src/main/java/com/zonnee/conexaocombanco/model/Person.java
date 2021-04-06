package com.zonnee.conexaocombanco.model;

public class Person {
    private int idPerson;
    private String name;
    private String cpf;
    private Adress adress;
    private Device device;

    public Person(){

    }

    public Person(int idPerson, String name, String cpf, Adress adress, Device device) {
        this.setIdPerson(idPerson);
        this.setName(name);
        this.setCpf(cpf);
        this.setAdress(adress);
        this.setDevice(device);
    }

    public void statusPerson(){
        System.out.println("======================================");
        System.out.println("                Person                ");
        System.out.println("======================================");
        System.out.println("ID: " + this.getIdPerson());
        System.out.println("Nome: " + this.getName());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.adress.getStreet() + ", " + this.adress.getNumber() + " - " + this.adress.getState());
        System.out.println("Device: " + this.device.getIdDevice());
        System.out.println("======================================");
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
