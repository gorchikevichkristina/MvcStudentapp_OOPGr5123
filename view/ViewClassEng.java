package SeminarsOOP.Mvcstudentapp.view;

import SeminarsOOP.Mvcstudentapp.controller.interfaces.IGetView;
import SeminarsOOP.Mvcstudentapp.model.core.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements IGetView {

    /**
     * вывод списка всех студентов
     *
     * @param students список студентов
     */
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("----------- List of students -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}