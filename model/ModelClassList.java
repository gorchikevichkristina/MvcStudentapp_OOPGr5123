package SeminarsOOP.Mvcstudentapp.model;

import SeminarsOOP.Mvcstudentapp.controller.interfaces.IGetModel;
import SeminarsOOP.Mvcstudentapp.model.core.Student;

import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания модул хранящего данные списком(List)
 */
public class ModelClassList implements IGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    /**
     * метод получения списка студентов
     *
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    @Override
    /**
     * метод удаления студента из списка
     */
    public void delStudent(int id) {
        boolean flag = false;
        for (Student std : students
        ) {
            if (std.getId() == id) {
                students.remove(std);
                System.out.println("Студент " + std + " удален");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Студент с таким id  не найден");
        }
    }
}