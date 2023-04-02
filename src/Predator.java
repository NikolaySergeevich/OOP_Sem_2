 /**
 * Метод "хищники" наследован от "млекопитающих"
 * Тут мы уже уточняем, что хищники кушают мясо(меттод feed() ) и это будет относиться ко всем классам, которые
 * будут наследоваться от этого класса
 */
public abstract class Predator extends Mammal{
    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Мясо";
    }


}
