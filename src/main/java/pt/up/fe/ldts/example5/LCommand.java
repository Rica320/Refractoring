package pt.up.fe.ldts.example5;

public class LCommand extends Turtle{

    public LCommand(int row, int column, char direction) {
        super(row, column, direction);
    }

    void execute() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
    }
}
