/**
 * Класс "Белка-летяга" наследник травоядные.implements Walkable, Flyable означает, что она может и ходить,
 * и летать.
 */
public class Flysquirrel extends Herbivore implements Walkable, Flyable{
    public Flysquirrel(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public int flySpeed() {
        return 25;
    }

    @Override
    public int runSpeed() {
        return 30;
    }
}
