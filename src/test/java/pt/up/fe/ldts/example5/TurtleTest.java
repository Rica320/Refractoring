package pt.up.fe.ldts.example5;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        Turtle turtle = new LCommand(5, 5, 'N');
        turtle.execute(); assertEquals('W', turtle.getDirection());
        turtle.execute(); assertEquals('S', turtle.getDirection());
        turtle.execute(); assertEquals('E', turtle.getDirection());
        turtle.execute(); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new RCommand(5, 5, 'N');

        turtle.execute(); assertEquals('E', turtle.getDirection());
        turtle.execute(); assertEquals('S', turtle.getDirection());
        turtle.execute(); assertEquals('W', turtle.getDirection());
        turtle.execute(); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getRow());
        assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new FCommand(5, 5, 'N');

        turtleN.execute();
        assertEquals(4, turtleN.getRow());
        assertEquals(5, turtleN.getColumn());

        Turtle turtleW = new FCommand(5, 5, 'W');

        turtleW.execute();
        assertEquals(5, turtleW.getRow());
        assertEquals(4, turtleW.getColumn());

        Turtle turtleS = new FCommand(5, 5, 'S');

        turtleS.execute();
        assertEquals(6, turtleS.getRow());
        assertEquals(5, turtleS.getColumn());

        Turtle turtleE = new FCommand(5, 5, 'E');

        turtleE.execute();
        assertEquals(5, turtleE.getRow());
        assertEquals(6, turtleE.getColumn());
    }

}