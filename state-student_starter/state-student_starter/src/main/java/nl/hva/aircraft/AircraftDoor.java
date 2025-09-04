package nl.hva.aircraft;

import nl.hva.state.*;

public class AircraftDoor {

    //TODO add fields as necessary
    State openState;
    State closedState;
    State armedState;
    State lockedState;
    State deployedState;

    State state;


    private final String id;

    public AircraftDoor(String id) {
        this.id = id;
        openState = new OpenState(this);
        closedState = new ClosedState(this);
        armedState = new ArmedState(this);
        lockedState = new LockedState(this);
        deployedState = new SlideDeployedState(this);
        state = openState;
    }

    public String openDoor(){
        return state.openDoor();
    }
    public String closeDoor() {
        return state.closeDoor();
    }
    public String armDoor() {
        return state.armDoor();
    }
    public String lockDoor() {
        return state.lockDoor();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
    public State getOpenState(){return openState;}
    public State getClosedState(){ return closedState; }
    public State getLockedState(){ return lockedState; }
    public State getArmedState() { return armedState; }
    public State getDeployedState() { return deployedState; }

    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append("\nnl.hva.aircraft.Aircraft Door: "+id);
        status.append("\n");
        status.append("nl.hva.state.State is " + state + "\n");
        return status.toString();
    }


}
