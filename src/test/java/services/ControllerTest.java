package services;

import data.BuildingSamples;
import models.Building;
import models.Elevator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

    @Test
    void checkButtonsTest(){
        //given
        Building building = BuildingSamples.getValidBuildingV1();
        Controller controller = new Controller();

        //when
        controller.checkButtons(building);

        //then
        assertEquals(1, building.getElevators().get(0).getGoingVector());
        assertEquals(1, building.getElevators().get(1).getGoingVector());
    }

    @Test
    void checkElevatorTestV1(){
        //given
        Building building = BuildingSamples.getValidBuildingV2();
        Controller controller = new Controller();
        Elevator elevator = building.getElevators().get(0);
        Elevator elevator1 = building.getElevators().get(1);

        //when
        controller.checkElevator(elevator, building);
        controller.checkElevator(elevator1, building);

        //then
        assertTrue(elevator.isDoorsOpen());
        assertFalse(elevator1.isDoorsOpen());
    }

}
