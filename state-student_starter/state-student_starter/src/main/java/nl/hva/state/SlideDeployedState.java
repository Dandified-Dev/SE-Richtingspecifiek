package nl.hva.state;

import nl.hva.aircraft.AircraftDoor;

import javax.swing.plaf.PanelUI;

public class SlideDeployedState implements State{
    AircraftDoor aircraftDoor;
    public SlideDeployedState(AircraftDoor aircraftDoor) {
        this.aircraftDoor = aircraftDoor;
    }

    @Override
    public String lockDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String closeDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String openDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String armDoor() {
        return Messages.DOOR_NEEDS_RESETTING;
    }

    @Override
    public String toString(){
        return Messages.SLIDE_DEPLOYED;
    }
}
