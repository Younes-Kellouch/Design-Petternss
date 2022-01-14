package tp.al.model.elevator.state;

import tp.al.model.Elevator;

public class ElevatorRestingState extends ElevatorState {

    @Override
    public ElevatorState move(String direction) {
        if(direction.equals("UP")) {
            return new ElevatorGoingUpState();
        }
        if(direction.equals("DOWN")) {
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
        return Math.abs(floor - currentFloor);
    }

}
