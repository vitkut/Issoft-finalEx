package data;

import models.Building;
import models.Floor;
import models.Human;
import services.BuildingCreator;

public class BuildingSamples {

    public static Building getValidBuildingV1(){
        Building building = BuildingCreator.getBuilding(5, 2, 400, 1, 1);
        Human human1 = new Human(60, 3);//1 to 3
        Human human2 = new Human(60, 1);//2 to 1
        Human human3 = new Human(60, 3);//2 to 3
        Human human4 = new Human(60, 1);//3 to 1
        Human human5 = new Human(60, 3);//4 to 3
        Human human6 = new Human(60, 1);//4 to 1
        Floor floor = building.getFloors().get(1);
        floor.addToUp(human1);
        floor = building.getFloors().get(2);
        floor.addToDown(human2);
        floor.addToUp(human3);
        floor = building.getFloors().get(3);
        floor.addToDown(human4);
        floor = building.getFloors().get(4);
        floor.addToDown(human5);
        floor.addToDown(human6);

        return building;
    }

    public static Building getValidBuildingV2(){
        Building building = BuildingCreator.getBuilding(3, 2, 400, 1, 1);
        Human human1 = new Human(60, 2);//1 to 2
        Human human2 = new Human(60, 0);//1 to 0
        Floor floor = building.getFloors().get(1);
        floor.addToUp(human1);
        floor.addToDown(human2);
        building.getElevators().get(0).setLocation(1);

        return building;
    }

    public static Building getValidBuildingV3(){
        Building building = BuildingCreator.getBuilding(3, 2, 400, 1, 1);
        Human human1 = new Human(60, 2);//1 to 2
        Human human2 = new Human(60, 0);//1 to 0
        Floor floor = building.getFloors().get(1);
        floor.addToUp(human1);
        building.getElevators().get(0).setLocation(1);
        building.getElevators().get(0).getHumans().add(human2);

        return building;
    }
}
