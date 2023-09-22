package SeminarsOOP.Mvcstudentapp.view;

import SeminarsOOP.Mvcstudentapp.controller.interfaces.IGetView;
import SeminarsOOP.Mvcstudentapp.model.core.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClass implements IGetView {

    /**
     * вывод списка всех студентов
     *
     * @param students список студентов
     */
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
