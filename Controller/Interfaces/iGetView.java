package SeminarsOOP.Mvcstudentapp.Controller.Interfaces;

import SeminarsOOP.StudentApp.Domen.Student;

import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote интерфейс для взаимодейсвтия с модулем отображения
 */
public interface iGetView {
    /**
     * вывод списка всех студентов
     *
     * @param students список студентов
     */
    void printAllStudent(List<Student> students);

    /**
     * @param msg имя команды
     * @apiNote метод ввода команд для управления функциями
     */
    String prompt(String msg);
}
