package algorithm.gameoflife;

public class CellForm {

    private boolean isAlive;

    private Location location;

    public Location getLocation() {
        return location;
    }

    public CellForm(int x, int y, boolean isAlive) {
        this.isAlive = isAlive;
        location = new Location(x, y);

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getLocX() {
        return location.getX();
    }

    public int getLocY() {
        return location.getY();
    }

    @Override
    public String toString() {
        return (isAlive ? "X" : " ");
    }

}
