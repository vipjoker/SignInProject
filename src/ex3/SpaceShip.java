package ex3;

/**
 * Created by igor on 25.04.15.
 */
public class SpaceShip {
    int size;
    String name;
    Pilot pilot;

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    void launch() {
        System.out.println(name + " пилот " + pilot.name + " полетел");
    }
}
