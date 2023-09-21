package SeminarsOOP.Mvcstudentapp.Model;

import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetModel;
import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания модуля хранящего данные в виде HashMap
 */
public class ModelClassHash implements iGetModel {
    private Map<Long, Student> studentMap;

    public ModelClassHash(Map<Long, Student> studMap) {
        this.studentMap = studMap;
    }

    @Override
    /**
     * метод получкения списк студентов из HaspMap
     */
    public List<Student> getStudents() {
        List<Student> stdList = new ArrayList<>();
        for (Student std : studentMap.values()
        ) {
            stdList.add(std);
        }
        return stdList;
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
        if (flag == false) {
            System.out.println("Студент с таким id  не найден");
        }
    }
}