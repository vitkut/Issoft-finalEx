package services;

import models.Building;
import models.Elevator;
import models.Floor;

import java.util.ArrayList;

public class BuildingCreator {

    public static Building getBuilding(int numberOfFloors, int liftingCapacity, int elevatorSteed, int doorSpeed){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        ArrayList<Elevator> elevators = new ArrayList<Elevator>();
        for(int i = 0; i < numberOfFloors; i++){
            floors.add(new Floor(i));
            elevators.add(new Elevator(0, liftingCapacity, elevatorSteed, doorSpeed));
        }
        return new Building(numberOfFloors, elevators, floors);
    }

}
