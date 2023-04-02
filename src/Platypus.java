/**
 * Класс "Унконос". Т.к. он и не хищник вроде, и не травоядный, потому что может кушать и мясо, и траву.
 * То мы его делаем наследником "Млекопитающих". И переопреляем свойства  ему присущные.
 */
public class Platypus extends Mammal implements Walkable{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ttt";
    }

    @Override
    public String feed() {
        return "Рыба, трава";
    }

    @Override
    public int runSpeed() {
        return 6;
    }
}
