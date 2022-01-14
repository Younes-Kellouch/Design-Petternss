package tp.al.model.elevator.state;

import tp.al.model.Elevator;

public abstract class ElevatorState {

    public abstract ElevatorState move(String direction);

    public abstract ElevatorState stop(int floor);

    public abstract int getDistanceFromFloor(int floor, int currentFloor, int nFloors);

}
