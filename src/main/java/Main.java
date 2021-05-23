import models.Building;
import models.Elevator;
import models.Floor;
import models.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.BuildingCreator;
import services.ButtonPusher;
import services.Controller;
import services.HumanCreator;

public class Main {

    private static Building building;
    private static Controller controller;
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        building = BuildingCreator.getBuilding(3, 2, 400, 1, 1);
        Human human1 = new Human(60, 2);//1 to 2
        Human human2 = new Human(60, 0);//1 to 0
        Floor floor = building.getFloors().get(1);
        floor.addToUp(human1);
        floor.addToDown(human2);
        building.getElevators().get(0).setLocation(1);
        controller = new Controller();

        int i = 0;
        while (i < 5){
            /*if(Math.random() < 0.1){
                HumanCreator.createRandomHuman(building);
            }
            ButtonPusher.press(building);*/
            controller.control(building);
            moveElevators();
            i++;
            logger.debug("Building - "+building);
        }
    }

    public static void moveElevators(){
        for(Elevator e:building.getElevators()){
            if(!e.isDoorsOpen()){
                if(e.getGoingVector() > 0 && e.getLocation() < building.getNumberOfFloors()-1){
                    e.setLocation(e.getLocation()+1);
                }
                if(e.getGoingVector() < 0 && e.getLocation() > 0){
                    e.setLocation(e.getLocation()-1);
                }
            }

        }
    }
}
