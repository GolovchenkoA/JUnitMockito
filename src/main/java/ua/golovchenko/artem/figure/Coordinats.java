package ua.golovchenko.artem.figure;

/**
 * Created by головченко on 05.12.2016.
 */
public class Coordinats {
    private int x;
    private int y;

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setCoordinats(int x, int y){
        this.x = x;
        this.y = y;
    }
}
