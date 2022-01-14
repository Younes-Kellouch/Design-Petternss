package tp.al.model.elevator.state;

import tp.al.model.Elevator;

public class ElevatorGoingUpState extends ElevatorState {

    @Override
    public ElevatorState move(String direction) {
        if (direction.equals("DOWN")) {
            return new ElevatorGoingDownState();
        }
        return null;
    }

    @Override
    public ElevatorState stop(int floor) {
        return new ElevatorStoppedState();
    }

    @Override
    public int getDistanceFromFloor(int floor, int currentFloor, int nFloors) {
        int distance = floor - currentFloor;
        if (distance < 0) {
            distance = nFloors - distance;
        }

        return distance;
    }
}
