package pt.up.fe.ldts.example5;

abstract public class Turtle {
    protected int row;
    protected int column;
    protected char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    abstract void execute();
}
