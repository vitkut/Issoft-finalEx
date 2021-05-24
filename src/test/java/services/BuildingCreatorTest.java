package services;

import models.Building;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingCreatorTest {

    @Test
    void getBuildingTest(){
        //given
        int numOfFloors = 5;
        int numOfElevators = 3;
        int liftingCapacity = 1000;
        int elevatorSpeed = 10;
        int doorSpeed = 10;

        //when
        Building building = BuildingCreator.getBuilding(numOfFloors, numOfElevators, liftingCapacity, elevatorSpeed, doorSpeed);

        //then
        assertEquals(numOfFloors, building.getFloors().size());
        assertEquals(numOfElevators, building.getElevators().size());
        assertEquals(liftingCapacity, building.getElevators().get(numOfElevators-1).getLiftingCapacity());
        assertEquals(elevatorSpeed, building.getElevators().get(numOfElevators-1).getSpeed());
        assertEquals(doorSpeed, building.getElevators().get(numOfElevators-1).getDoorsSpeed());
    }

}
