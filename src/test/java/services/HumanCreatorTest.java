package services;
import data.BuildingSamples;
import models.Building;
import models.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanCreatorTest {

    @Test
    void createRandomHuman(){
        //given
        Building building = BuildingCreator.getBuilding(2, 1, 1, 1, 1);

        //when
        HumanCreator.createRandomHuman(building);
        Human human = null;
        int floor = 0;
        for(int i = 0; i < building.getNumberOfFloors(); i++){
            if(building.getFloors().get(i).getToUp().size() > 0){
                human = building.getFloors().get(i).getToUp().element();
                floor = i;
                break;
            }
            if(building.getFloors().get(i).getToDown().size() > 0){
                human = building.getFloors().get(i).getToDown().element();
                floor = i;
                break;
            }
        }
        boolean bool = false;
        if(human != null && human.getWeight() >= 40 && human.getWeight() <= 120){
            bool = true;
        }

        //then
        assertNotNull(human);
        assertNotEquals(floor, human.getRequiredFloor());
        assertTrue(bool);
    }
}
