package nl.hva.observablestation;

import nl.hva.sensors.*;

import java.util.ArrayList;

public class WeatherDisplay implements Observer{
    private String name;
    private final ArrayList<Sensor> sensors;
    public WeatherDisplay(String name) {
        this.name = name;
        this.sensors = new ArrayList<>();
        sensors.add(new RainGauge());
        sensors.add(new Thermometer());
        sensors.add (new Hygrometer());
        sensors.add (new Anemometer());
    }

    @Override
    public void display(){
        System.out.println(name);
        System.out.println("Current weather is: ");
        for (Sensor s: sensors){
            s.takeMeasurement();
            System.out.println(s);
        }
    }

}
