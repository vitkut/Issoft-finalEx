package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Building {

    private int numberOfFloors;
    private ArrayList<Elevator> elevators;
    private ArrayList<Floor> floors;

    public Building(int numberOfFloors, ArrayList<Elevator> elevators, ArrayList<Floor> floors) {
        this.numberOfFloors = numberOfFloors;
        this.elevators = elevators;
        this.floors = floors;

    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(ArrayList<Elevator> elevators) {
        this.elevators = elevators;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "\n\tnumberOfFloors=" + numberOfFloors +
                ", \n\tnumOfElevators=" + elevators.size() +
                ", \n\televators=" + elevators +
                ", \n\tfloors=" + floors +
                "\n}";
    }
}
