package nl.hva.observablestation;

import nl.hva.sensors.*;
import java.util.ArrayList;

public class ObservableWeatherStation implements Subject{
    private final ArrayList<Observer> observers;

    public ObservableWeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void checkSensors(){
        for (Observer observer: observers) {
            observer.display();
        }
    }

    @Override
    public void removeObserver(WeatherDisplay livingRoomDisplay) {
        observers.remove(livingRoomDisplay);
    }

    @Override
    public void registerObserver(WeatherDisplay livingRoomDisplay) {
        observers.add(livingRoomDisplay);
    }

    @Override
    public int getNumberOfObservers() {
        return observers.size();
    }
}