package SeminarsOOP.Mvcstudentapp.View;

import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetView;
import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

public class ViewClassEng implements iGetView {
    public void printAllStudent(List<Student> students) {
        System.out.println("----------- List of students -----------");
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

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}