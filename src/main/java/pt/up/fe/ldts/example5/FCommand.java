package pt.up.fe.ldts.example5;


public class FCommand extends Turtle{

    public FCommand(int row, int column, char direction) {
        super(row, column, direction);
    }

    void execute() {
        if (direction == 'N') row--;
        if (direction == 'S') row++;
        if (direction == 'W') column--;
        if (direction == 'E') column++;
    }
}
