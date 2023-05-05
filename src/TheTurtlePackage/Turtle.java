package TheTurtlePackage;

import static TheTurtlePackage.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    public boolean penisUp(){
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == SOUTH) face(WEST);
        if (direction == EAST) face(SOUTH);
    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if (direction == Direction.EAST) face(Direction.NORTH);
        if (direction == Direction.SOUTH) face(Direction.EAST);
    }

    public void moveForward(int i) {
    }

    public Position getPosition() {
    }
}
