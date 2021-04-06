package com.zonnee.conexaocombanco.model;

public class Device {
    private int idDevice;
    private Dealership dealership;
    private double valueKw;
    private double valueBasic;
    private double valueIlum;
    private double valueSolarPanel;
    private InversorDevice energyInversor;
    private ClockDevice energyClock;

    public Device(int idDevice, Dealership dealership, double valueKw, double valueBasic, double valueIlum, double valueSolarPanel, InversorDevice energyInversor, ClockDevice energyClock) {
       this.setIdDevice(idDevice);
       this.setDealership(dealership);
       this.setValueKw(valueKw);
       this.setValueBasic(valueBasic);
       this.setValueIlum(valueIlum);
       this.setValueSolarPanel(valueSolarPanel);
       this.setEnergyInversor(energyInversor);
       this.setEnergyClock(energyClock);
    }
    public Device(){

    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    public double getValueKw() {
        return valueKw;
    }

    public void setValueKw(double valueKw) {
        this.valueKw = valueKw;
    }

    public double getValueBasic() {
        return valueBasic;
    }

    public void setValueBasic(double valueBasic) {
        this.valueBasic = valueBasic;
    }

    public double getValueIlum() {
        return valueIlum;
    }

    public void setValueIlum(double valueIlum) {
        this.valueIlum = valueIlum;
    }

    public double getValueSolarPanel() {
        return valueSolarPanel;
    }

    public void setValueSolarPanel(double valueSolarPanel) {
        this.valueSolarPanel = valueSolarPanel;
    }

    public InversorDevice getEnergyInversor() {
        return energyInversor;
    }

    public void setEnergyInversor(InversorDevice energyInversor) {
        this.energyInversor = energyInversor;
    }

    public ClockDevice getEnergyClock() {
        return energyClock;
    }

    public void setEnergyClock(ClockDevice energyClock) {
        this.energyClock = energyClock;
    }
}
