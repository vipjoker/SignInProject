package ex3;

/**
 * Created by igor on 25.04.15.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
//        pilot.name = "";
        LaunchPad baikonur = new LaunchPad();
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.name = "СОЮЗ";
        MissionControlCenter missionControlCenter = new MissionControlCenter();

        spaceShip.setPilot(pilot);

        baikonur.setSpaceShip(spaceShip);
        baikonur.setMissionControlCenter(missionControlCenter);
        baikonur.missionControlCenter.setSpaceShip(spaceShip);

        baikonur.missionControlCenter.launch();
    }
}
