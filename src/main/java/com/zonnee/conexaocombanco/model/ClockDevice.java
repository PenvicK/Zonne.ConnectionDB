package com.zonnee.conexaocombanco.model;

public class ClockDevice {
    private int idClockDevice;
    private double energyExpend;
    private double energyCredit;

    public ClockDevice(int idClockDevice, double energyExpend, double energyCredit){
        this.setIdClockDevice(idClockDevice);
        this.setEnergyExpend(energyExpend);
        this.setEnergyCredit(energyCredit);
    }

    public  ClockDevice(){

    }

    public void statusClockDevice(){
        System.out.println("======================================");
        System.out.println("                Relógio               ");
        System.out.println("======================================");
        System.out.println("Id: " + this.getIdClockDevice());
        System.out.println("Gasto: " + this.getEnergyExpend() + "Kw");
        System.out.println("Crédito: " + this.getEnergyCredit() + "Kw");
        System.out.println("======================================");
    }

    public int getIdClockDevice() {
        return idClockDevice;
    }

    public void setIdClockDevice(int idClockDevice) {
        this.idClockDevice = idClockDevice;
    }

    public double getEnergyExpend() {
        return energyExpend;
    }

    public void setEnergyExpend(double energyExpend) {
        this.energyExpend = energyExpend;
    }

    public double getEnergyCredit() {
        return energyCredit;
    }

    public void setEnergyCredit(double energyCredit) {
        this.energyCredit = energyCredit;
    }
}
