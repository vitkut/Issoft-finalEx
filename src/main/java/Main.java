import models.Building;
import models.Elevator;
import services.BuildingCreator;
import services.ButtonPusher;
import services.HumanCreator;

public class Main {

    public static Building building;

    public static void main(String[] args) {
        building = BuildingCreator.getBuilding(3, 2, 400, 1, 1);

        while (true){
            if(Math.random() < 0.1){
                HumanCreator.createRandomHuman(building);
            }
            ButtonPusher.press(building);

        }
    }

    public static void moveElevators(){
        for(Elevator e:building.getElevators()){

        }
    }
}
