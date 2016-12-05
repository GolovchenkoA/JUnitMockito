package ua.golovchenko.artem.figure;

import java.awt.event.MouseEvent;

/**
 * Created by головченко on 05.12.2016.
 */
public class Circle implements Figure {

    private Coordinats coordinats;

    public Circle(Coordinats coordinats){
        setCoordinats(coordinats);
    }

    public Coordinats getCoordinats() {
        return coordinats;
    }

    @Override
    public void setCoordinats(Coordinats coordinats) {
        this.coordinats = coordinats;
    }

    @Override
    public void setCoordinats(int x, int y) {
        coordinats.setCoordinats(x,y);
    }

    @Override
    public int getX() {
        return coordinats.getX();
    }

    @Override
    public int getY() {
        return coordinats.getY();
    }
}
