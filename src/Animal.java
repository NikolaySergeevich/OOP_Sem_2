/**
 * Абстрактный класс, который внедряет в себя интерфейс Speakable.
 * Все классы-наследники будут обязаны использовать методы, которые описаны в Speakable
 */
public abstract class Animal implements Speakable{
    private String name;
    private boolean alive;


    /**
     * Метод определяет кто что кушает
     * @return
     */
    public abstract String feed();

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Кличка животного: %s\n", this.name))
                .append(String.format("Корм: %s\n", feed()))
                .append(String.format("Голос: %s\n", speak()));

        return res.toString();

    }
}
