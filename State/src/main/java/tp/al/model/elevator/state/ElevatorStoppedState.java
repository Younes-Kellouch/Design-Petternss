package tp.al.model.elevator.state;

import tp.al.model.Elevator;

public class ElevatorStoppedState extends ElevatorState {

    @Override
    public ElevatorState move(String direction) {
        return null;
    }

    @Override
    public ElevatorState stop(int floor) {
        return null;
    }

    @Override
    public int getDistanceFromFloor(int floor, int currentFloor, int nFloors) {
        return 2 * nFloors;
    }
}
