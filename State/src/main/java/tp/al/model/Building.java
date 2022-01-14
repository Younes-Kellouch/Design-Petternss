package tp.al.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Building {
    //Attributes
    private int numberOfFloors;
    private Map<String, Elevator> elevators = new HashMap<>();

    //Constructor
    public Building(int numberOfFloors, String... elevatorsInit) {
        this.numberOfFloors = numberOfFloors;
        for (String elevatorInit : elevatorsInit) {
            createElevator(elevatorInit);
        }
    }

    //Public Methods
    public String requestElevator() {
        return requestElevator(numberOfFloors);
    }

    public String requestElevator(int floor) {
        return Collections.min(elevators.entrySet(), new ElevatorDistanceFromFloorComparator(floor)).getKey();
    }

    public void move(String elevatorId, String direction) {
        Elevator elevator = getElevatorById(elevatorId);
        elevator.move(direction);
    }

    public void stopAt(String elevatorId, int floor) {
        Elevator elevator = getElevatorById(elevatorId);
        elevator.stopAt(floor);
    }

    //Private Methods
    private Elevator getElevatorById(String elevatorId) {
        return elevators.get(elevatorId);
    }

    private void createElevator(String elevatorInit) {
        String[] elevatorInitSplit = elevatorInit.split(":");
        Elevator elevator = new Elevator(this, Integer.parseInt(elevatorInitSplit[1]));
        elevators.put(elevatorInitSplit[0], elevator);
    }

    //Getters and Setters
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    private class ElevatorDistanceFromFloorComparator implements Comparator<Map.Entry<String, Elevator>> {

        private int floor;

        public ElevatorDistanceFromFloorComparator(int floor) {
            this.floor = floor;
        }

        @Override
        public int compare(Map.Entry<String, Elevator> elevatorEntry1, Map.Entry<String, Elevator> elevatorEntry2) {
            return elevatorEntry1.getValue().getDistanceFromFloor(floor) - elevatorEntry2.getValue().getDistanceFromFloor(floor);
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
}