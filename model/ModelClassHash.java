package SeminarsOOP.Mvcstudentapp.model;

import SeminarsOOP.Mvcstudentapp.controller.interfaces.IGetModel;
import SeminarsOOP.Mvcstudentapp.model.core.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания модуля хранящего данные в виде HashMap
 */
public class ModelClassHash implements IGetModel {
    private Map<Long, Student> studentMap;

    public ModelClassHash(Map<Long, Student> studMap) {
        this.studentMap = studMap;
    }

    @Override
    /**
     * метод получкения списк студентов из HaspMap
     */
    public List<Student> getStudents() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    /**
     * метод удаления студента из HashMap
     */
    public void delStudent(int id) {
        boolean flag = false;
        for (Map.Entry<Long, Student> entry : studentMap.entrySet()
        ) {
            if (entry.getValue().getId() == id) {
                studentMap.remove(entry.getKey());
                System.out.println("Студент " + entry.getValue() + " удален");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Студент с таким id  не найден");
        }
    }
}