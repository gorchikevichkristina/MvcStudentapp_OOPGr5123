package SeminarsOOP.Mvcstudentapp.model.core;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote родительский класс для описания учатсинка
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * @param name имя участинка
     * @param age  возраст участинка
     * @apiNote конструктор класса
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
