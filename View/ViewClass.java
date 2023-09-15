package SeminarsOOP.Mvcstudentapp.View;

import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetView;
import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

import java.util.List;
import java.util.Scanner;


public class ViewClass implements iGetView {

    public void printAllStudent(List<Student> students) {
        System.out.println("----------- Список студентов -----------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    /**
     * вывод списка всех студентов
     *
     * @param students список студентов
     */
    @Override
    public void printAllStudent(List<SeminarsOOP.StudentApp.Domen.Student> students) {

    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
