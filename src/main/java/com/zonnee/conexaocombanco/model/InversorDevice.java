package com.zonnee.conexaocombanco.model;

public class InversorDevice {
    private int idInversorDevice;
    private double energyMinute;

    public InversorDevice(int idInversorDevice, double energyMinute){
        this.setIdInversorDevice(idInversorDevice);
        this.setEnergyMinute(energyMinute);
    }

    public  InversorDevice(){

    }

    public void statusInversorDevice(){
        System.out.println("======================================");
        System.out.println("               Inversor               ");
        System.out.println("======================================");
        System.out.println("Id: " + this.getIdInversorDevice());
        System.out.println("Energia por Minuto: " + this.getEnergyMinute() + "Kw");
        System.out.println("======================================");
    }

    public int getIdInversorDevice() {
        return idInversorDevice;
    }

    public void setIdInversorDevice(int idInversorDevice) {
        this.idInversorDevice = idInversorDevice;
    }

    public double getEnergyMinute() {
        return energyMinute;
    }

    public void setEnergyMinute(double energyMinute) {
        this.energyMinute = energyMinute;
    }
}
