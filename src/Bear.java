/**
 * Класс медведь. Наследник Predator (хищники). Тут добавляем поле speed. И изменяем конструктор.
 * Теперь при создании каждого медведя будет указываться индивид. скорость. implements Walkable -
 * означает, что мы пометили медведя свойством ходить и передаём в функцию runSpeed() скорость медведя,
 * которую указали про создании медведя.
 */
public class Bear extends Predator implements Walkable{

    private int speed;
    public Bear(String name, int speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public String speak() {
        return "РРРЪ";
    }

    @Override
    public int runSpeed() {
        return speed;
    }
}
