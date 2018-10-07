package org.eustrosoft.arkanoid;

import org.eustrosoft.elements.Ball;
import org.eustrosoft.elements.Brick;
import org.eustrosoft.elements.Stand;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class Arkanoid {

    private int  width;
    private int  height;
    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public static void main(String[] args) {
        Reader r = new InputStreamReader(System.in);

    }
}
