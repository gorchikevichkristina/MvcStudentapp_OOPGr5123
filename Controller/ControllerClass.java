package SeminarsOOP.Mvcstudentapp.Controller;

import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetModel;
import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetView;
import SeminarsOOP.StudentApp.Domen.Student;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote контролер для взаимодейсвтия между модулем отображения и модулем данных
 */
public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    /**
     * список студентов
     */
    private List<Student> students = new ArrayList<Student>();

    /**
     * @param model модуля данных
     * @param view  модуль отображения
     * @apiNote конструктор класса
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * метод проверки данных
     *
     * @param studs список студентов
     */
    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * метод обновления данных
     */
    public void update() {

        //MVP
        students = model.getStudents();

        if (testData(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }


        // MVC
        //view.printAllStudent(model.getStudents());
    }


    /**
     * метод управления контролером через команды с консоли
     */
    public void run() throws FileNotFoundException {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    System.out.println("Введите id студента для удаления:");
                    Scanner scan = new Scanner(System.in);
                    int id = scan.nextInt();
                    model.delStudent(id);
                    break;
            }
        }
    }
}