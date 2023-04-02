import java.util.ArrayList;
import java.util.List;

/**
 * Класс "зоопарк". Экземпляр этого класса будет собирать в себе экземпляры классов животных. Так же он
 * может содержать в себе радио. Тут реализовано взаимодействия животных с радио, а точнее звуков, которые
 * они издают.
 */
public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();

    /**
     * Метод добавления животного.
     *
     * @param newAnimal самый родительский класс для животных
     */
    public void addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    /**
     * Метод показа животных. System.out.println(animal) - animal в скобках автоматом вызывает метод
     * toString, который у на переопределён.
     */
    public void showAll() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }

    /**
     * Метод содержит в себе метод noises(), про котрый рассказано ниже. Этот же метод проходит по списку
     * типа Speakable. Напомню, что у каждого элемента этого списка есть метод speak(), который возвращает
     * звуки, которые производит или произносит этот элемент. Вот мы и печатаем то, что произносит каждый
     * из этого списка.
     */
    public void noise() {
        for (Speakable speak : noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    /**
     * метод возвращает список типа Speakable. Т.к. мы знаем, что все классы животных имеют интерфейс Speakable,
     * то мы не делаем никаких проверок на наличие встроенного(дополнительного класаа)  Speakable. А просто
     * проходимся по животным и добавляем их в список класса Speakable. И в конце добавляем радио. Хоть
     * животные и радио это совсем разные классы и они никак не связаны иерархически, но эти классы имеют интерфейс
     * Speakable, то их можно сложить в один список типа Speakable. ТО, что мы и сделали
     * @return
     */
    private List<Speakable> noises() {
        List<Speakable> res = new ArrayList<>();
        for (Animal animal : animals) {
            res.add(animal);
        }
        res.add(radio);
        System.out.println(res.size());
        return res;
    }

    /**
     * Этот метод возвращает список типа Walkable. У нас не каждое живтное имеет интерфейс Walkable.
     * Поэтому мы делаем проверку при прохождении по зоопарку на наличие интерфейса у отдельного животного.
     * И те, которые имеют такой интерфейс заносятся в список.
     * @return
     */
    private List<Walkable> runners() {
        List<Walkable> res = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    /**
     * Этот метод содержит в себе метод runners(). Про него я рассказал выше. Этот же список проходит
     * по списку и ищет то животное, у которого самаая большая скорость передвижения. Напомню, что такой
     * параметр (или функцией) обладают только те животные, которые имеют интерфейс Walkable.
     * При возврате мы переводим из типа Walkable в тип Animal.
     * @return
     */
    public Animal championByRun() {
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner : start) {
            if (champ.runSpeed() < runner.runSpeed()) {
                champ = runner;
            }
        }
        return (Animal) champ;
    }
    // ниже описаны два метода сходи с теми, где мы искали максимальную скорость передвижения животных.
    // это два метода выше.
    private List<Flyable> flyers() {
        List<Flyable> res = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly() {
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer : start) {
            if (champ.flySpeed() < flyer.flySpeed()) {
                champ = flyer;
            }
        }
        return (Animal) champ;
    }
}
