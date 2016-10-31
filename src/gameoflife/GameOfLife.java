package algorithm.gameoflife;

public class GameOfLife {
    public static void main(String[] args) {
        World world = new World(20);
        world.addForm(3, 6);
        world.addForm(5, 5);
        world.addForm(5, 6);
        world.addForm(5, 7);
        world.addForm(4, 7);
        world.displayWorld();
        world.nextGeneration().nextGeneration().nextGeneration().nextGeneration().nextGeneration();
    }
}
