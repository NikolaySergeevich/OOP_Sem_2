public class Crocodile extends Predator implements Swimable, Walkable{
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "хрхр, пастью тяп";
    }

    @Override
    public int speadSwim() {
        return 10;
    }

    @Override
    public int runSpeed() {
        return 19;
    }

    @Override
    public String toString() {
        return String.format("%sСкорость плава: %d км/ч", super.toString(), speadSwim());
    }
}
