import models.Building;
import services.BuildingCreator;

public class Main {

    public static Building building;

    public static void main(String[] args) {
        building = BuildingCreator.getBuilding(3, 400, 1, 1);

        while (true){

        }
    }
}
