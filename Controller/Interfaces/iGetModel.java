package SeminarsOOP.Mvcstudentapp.Controller.Interfaces;

import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote интерфейс для взаимодейсвтия с модулем данных
 */
public interface iGetModel {
    /**
     * метод получения списка студентов
     *
     * @return список студентов
     */
    public List<Student> getStudents();

    /**
     * метод удаления студента по id
     *
     * @param id идентификатор студента
     */
    public void delStudent(int id) throws FileNotFoundException;
}
