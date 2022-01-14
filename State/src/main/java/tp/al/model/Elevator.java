package tp.al.model;

import tp.al.model.elevator.state.ElevatorRestingState;
import tp.al.model.elevator.state.ElevatorState;

public class Elevator {
    //Attributes
    private Building building;
    private int floor;
    private ElevatorState elevatorState;

    //Constructor
    public Elevator(Building building, int startingFloor) {
        this.building = building;
        floor = startingFloor;
        elevatorState = new ElevatorRestingState();
    }

    //Private Methods
    public void move(String direction) {
        ElevatorState newState = elevatorState.move(direction);
        if(newState != null) {
            this.elevatorState = newState;
        }
    }

    public void stopAt(int floor) {
        ElevatorState newState = elevatorState.stop(floor);
        if(newState != null) {
            this.elevatorState = newState;
        }
    }

    //Getters and Setters
    public int getBuildingNumberOfFloors() {
        return building.getNumberOfFloors();
    }

    public int getDistanceFromFloor(int floor) {
        return elevatorState.getDistanceFromFloor(floor, this.floor, getBuildingNumberOfFloors());
    }
}
