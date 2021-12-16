package pt.up.fe.ldts.example5;

public class RCommand extends Turtle {

    public RCommand(int row, int column, char direction) {
        super(row, column, direction);
    }

    void execute() {
        if (direction == 'N') direction = 'E';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
    }
}
