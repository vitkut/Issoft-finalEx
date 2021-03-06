package services;

import models.Building;
import models.Elevator;
import models.Floor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class BuildingCreator {

    private static final Logger logger = LoggerFactory.getLogger(Building.class);

    public static Building getBuilding(int numOfFloors, int numOfElevators, int liftingCapacity, int elevatorSpeed, int doorSpeed){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        ArrayList<Elevator> elevators = new ArrayList<Elevator>();
        for(int i = 0; i < numOfFloors; i++){
            floors.add(new Floor(i));
        }
        for(int i = 0; i < numOfElevators; i++){
            elevators.add(new Elevator(0, liftingCapacity, elevatorSpeed, doorSpeed));
        }
        Building building = new Building(numOfFloors, elevators, floors);
        logger.debug("Building created - "+building);
        return building;
    }

}
