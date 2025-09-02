package nl.hva.observablestation;
public interface Subject {
    void removeObserver(WeatherDisplay livingRoomDisplay);

    void registerObserver(WeatherDisplay livingRoomDisplay);

    int getNumberOfObservers();
}
