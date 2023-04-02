/**
 * Класс "Корова". Наследник от Herbivore - травоядные.implements Walkable -
 *  * означает, что мы пометили корову свойством ходить и присваеваем корове скорость.
 */
public class Cow extends Herbivore implements Walkable{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Мууу";
    }

    @Override
    public int runSpeed() {
        return 20;
    }
}
