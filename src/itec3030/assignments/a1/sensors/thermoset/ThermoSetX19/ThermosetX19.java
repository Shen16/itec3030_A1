package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;


public class ThermosetX19 implements Thermostat{
    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature = 23;

    public ThermosetX19() {
        FrontEnd f = new FrontEnd(this); //NOT Thermostat t since then that would mean you are referring to some other object instantiated by that other class. But this is the thermostat class to be instantialted. So use this to refer to this object
        f.pack();
        f.setVisible(true);
    }


    @Override
    public void newTemperature(int temp) {
        System.out.println("ThermosetX19 (" + this.ID + ") reports: " + this.temperature + "C");
        this.temperature = temp;

    }

    @Override
    public ControllerInterface getController() {
        return this.c;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {
        this.c = controllerInterface;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String s) {
        this.ID = s;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public boolean enabled() {
        return this.enabled;
    }

    @Override
    public int getReading() {
        return this.temperature;
    }
}

