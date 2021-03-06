package io.johnliu.elementtd.level.tile;

import io.johnliu.elementtd.level.Level;
import io.johnliu.elementtd.level.tower.Tower;
import io.johnliu.elementtd.renderengine.RenderEngine;

public class Tile {

    protected int x;
    protected int y;
    protected boolean mobPassable;
    protected Tower tower;

    public Tile(int x, int y, boolean mobPassable) {
        this.x = x;
        this.y = y;
        this.mobPassable = mobPassable;
        this.tower = null;
    }

    public void update(Level level) {}

    public void render(RenderEngine engine) {}

    public void removeTower() {
        tower = null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Tower getTower() {
        return tower;
    }

    public boolean isMobPassable() {
        return mobPassable;
    }

}
