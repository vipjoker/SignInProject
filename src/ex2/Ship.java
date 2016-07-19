package ex2;

/**
 * Created by igor on 25.04.15.
 */
public class Ship {
    int length;
    Point leftUp;
    Point rightDown;
    boolean isHorizontal;

    public Ship(int length, Point leftUp, boolean isHorizontal) {
        this.length = length;
        this.leftUp = leftUp;
        //fixme DONE!
        rightDown = new Point();
        this.isHorizontal = isHorizontal;
        if (isHorizontal) {
            rightDown.x = leftUp.x + length - 1;
            rightDown.y = leftUp.y;
        } else {
            rightDown.x = leftUp.x;
            rightDown.y = leftUp.y + length - 1;
        }
    }

    boolean isIntersect(Ship ship) {
        if (ship.rightDown.y + 1 < leftUp.y) {
            return false;
        }

        if (ship.leftUp.y - 1 > rightDown.y) {
            return false;
        }

        if (ship.rightDown.x + 1 < leftUp.x) {
            return false;
        }

        if (ship.leftUp.x - 1 > rightDown.x) {
            return false;
        }

        return true;
    }


    //          #
    //          #
    //
    // ##   @@@@@@  ####

    //          #
    //          #
    //


    //          #
    //          #
    //
    // ##   @      ####
    //      @
    //      @

    //          #
    //          #
    //
}
