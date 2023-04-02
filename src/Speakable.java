/**
 * интерфейс, который в данной задаче будет реализовывать какие-то звуки.
 * Звуки могут произносить как животные, так и неодушевлённые предметы.
 * Т.к. для животных и неодушевлённых предметов будут разные иерархии классов, то без инткрфейса никак нельзя
 * реализовать взаимодействие животных и неодушевл. предметов. А с помощью интерф. можно.
 */
public interface Speakable {
    String speak();
}
