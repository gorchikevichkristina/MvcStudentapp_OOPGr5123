package SeminarsOOP.Mvcstudentapp.model.core;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания студента
 */
public class Student extends Person {
    /**
     * идентификатор студента
     */
    private int id;
    private static int generalId = 1;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }
}

