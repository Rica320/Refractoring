package pt.up.fe.ldts.example5

import spock.lang.Specification

class TurtleSpockTest extends Specification {

    def 'Rotate Left'() {
        given:
            def turtle = new LCommand(5, 5, 'N' as char);

        when:
            turtle.execute();

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getRow()
            5 == turtle.getColumn()
    }

    def 'Rotate Right'() {
        given:
            def turtle = new RCommand(5, 5, 'N' as char);


        when:
            turtle.execute();

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute();

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getRow()
            5 == turtle.getColumn()
    }

    def 'Forward'() {

        given:
            def turtleN = new FCommand(5, 5, 'N' as char)
            def turtleW = new FCommand(5, 5, 'W' as char);
            def turtleS = new FCommand(5, 5, 'S' as char);
            def turtleE = new FCommand(5, 5, 'E' as char);

        when:
            turtleN.execute();
            turtleW.execute();
            turtleS.execute();
            turtleE.execute();

        then:
            4 == turtleN.getRow()
            5 == turtleN.getColumn()

        and:
            5 == turtleW.getRow()
            4 == turtleW.getColumn()

        and:
            6 == turtleS.getRow()
            5 == turtleS.getColumn()

        and:
            5 == turtleE.getRow()
            6 == turtleE.getColumn()
    }
}
