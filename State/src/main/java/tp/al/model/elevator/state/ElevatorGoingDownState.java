package tp.al.model.elevator.state;

import tp.al.model.Elevator;

public class ElevatorGoingDownState extends ElevatorState {

    @Override
    public ElevatorState move(String direction) {
        if (direction.equals("UP")) {
            return new ElevatorGoingUpState();
        }
        return null;
    }

    @Override
    public ElevatorState stop(int floor) {
        return new ElevatorStoppedState();
    }

    @Override
    public int getDistanceFromFloor(int floor, int currentFloor, int nFloors) {
        int distance = currentFloor - floor;
        if (distance < 0) {
            distance = nFloors - distance;
        }

        return distance;
    }
}
