package TheTurtlePackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TheTurtlePackage.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle ijapa;

    @BeforeEach
    public void startWith() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertTrue(ijapa.penisUp());
        ijapa.penDown();

        assertFalse(ijapa.penisUp());
    }

    @Test
    public void testThatPenCanMoveUpTest() {
        ijapa.penDown();
        assertFalse(ijapa.penisUp());

        ijapa.penUp();

        assertTrue(ijapa.penisUp());
    }

    @Test
    public void testThatTurnRightWhileFacingEastTest() {
        assertSame(ijapa.getCurrentDirection(), Direction.EAST);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurnRightWhileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurnLeftWhileFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
        @Test
        public void turtleCanMoveForwardWhileFacingEastTest(){
            assertSame(ijapa.getCurrentDirection(), EAST);
            assertEquals(new Position(0,5), ijapa.getPosition());

            ijapa.moveForward(5);
            assertEquals(new Position(0,5), ijapa.getPosition());
        }
    }
