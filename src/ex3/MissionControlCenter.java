package ex3;

/**
 * Created by igor on 25.04.15.
 */
public class MissionControlCenter {
    SpaceShip spaceShip;

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    void launch() {
        System.out.println("полет разрешен");
        for (int i = 10; i >= 0; i--) {
            System.out.println("обратный отсчет " + i);
        }
        System.out.println("Пуск");
        spaceShip.launch();
    }
}
