package algorithm.gameoflife;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
    private CellForm[][] cells;
    private int dimension;
    private Set<CellForm> aliveCells = new HashSet<CellForm>();
    private Set<Location> deadLocation = new HashSet<Location>();

    public World(int dimension) {
        this.dimension = dimension;
        cells = new CellForm[dimension][dimension];
    }

    public void addForm(int x, int y) {
        cells[x][y] = new CellForm(x, y, true);
        aliveCells.add(cells[x][y]);
    }

    public void displayWorld() {
        System.out.println("----------------");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("[" + ((cells[i][j] == null) ? " " : cells[i][j]) + "]");
            }
            System.out.println();
        }
    }

    public World nextGeneration() {

        List<CellForm> deadCell = new ArrayList<CellForm>();
        for (CellForm cell : aliveCells) {
            int neighbourCount = getLiveNeighbourCellFormCount(cell.getLocation());
            if (neighbourCount < 2) {
                deadCell.add(cell);
            } else if (neighbourCount > 3) {
                deadCell.add(cell);
            }
        }
        Set<Location> newForms = createCellForms();
        for (Location loc : newForms) {
            addForm(loc.getX(), loc.getY());
        }
        killCellForms(deadCell);
        displayWorld();
        return this;
    }

    private Set<Location> createCellForms() {
        Set<Location> newFroms = new HashSet<Location>();
        for (Location location : deadLocation) {
            int neighbourLiveCount = getLiveNeighbourCount(location);
            if (neighbourLiveCount == 3) {
                newFroms.add(location);
            }
        }
        return newFroms;
    }

    private void killCellForms(List<CellForm> killCell) {
        for (CellForm cellForm : killCell) {
            cells[cellForm.getLocX()][cellForm.getLocY()] = null;
            aliveCells.remove(cellForm);

        }
    }

    private int getLiveNeighbourCellFormCount(Location cellLocation) {
        int neighbourForms = 0;

        for (Location loc : cellLocation.getNeighbourLocations()) {

            if (cells[loc.getX()][loc.getY()] != null) {
                neighbourForms++;
            } else {
                deadLocation.add(loc);
            }
        }
        return neighbourForms;
    }

    private int getLiveNeighbourCount(Location cellLocation) {
        int neighbourForms = 0;

        for (Location loc : cellLocation.getNeighbourLocations()) {

            if (cells[loc.getX()][loc.getY()] != null) {
                neighbourForms++;
            }
        }
        return neighbourForms;
    }
}
