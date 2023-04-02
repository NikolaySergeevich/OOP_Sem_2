/**
 * Метод "травоядные" наследован от "млекопитающих"
 * Тут мы уже уточняем, что травоядные кушают траву(меттод feed() ) и это будет относиться ко всем классам, которые
 * будут наследоваться от этого класса
 */
public abstract class Herbivore extends Mammal{

    public Herbivore(String name) {
        super(name);
    }
    @Override
    public String feed (){
        return "Трава";
    }

}
