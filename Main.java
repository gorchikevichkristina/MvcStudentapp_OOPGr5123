package SeminarsOOP.Mvcstudentapp;

import SeminarsOOP.Mvcstudentapp.Controller.ControllerClass;
import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetModel;
import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetView;
import SeminarsOOP.Mvcstudentapp.Model.Core.Student;
import SeminarsOOP.Mvcstudentapp.Model.ModelClassHash;
import SeminarsOOP.Mvcstudentapp.View.ViewClassEng;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote программа для обработки и отображения данных по студнетам
 */
public class Main {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Андрей", 25);
        Student s3 = new Student("Иван", 23);
        Student s4 = new Student("Дарья", 24);
        Student s5 = new Student("Света", 22);
        Student s6 = new Student("Игорь", 21);
        Student s7 = new Student("Мария", 21);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        Map<Long, Student> studMap = new HashMap<>();
        studMap.put(1L, s1);
        studMap.put(2L, s2);
        studMap.put(3L, s3);
        studMap.put(4L, s4);
        studMap.put(5L, s5);
        studMap.put(6L, s6);
        studMap.put(7L, s7);


//        ModelClassFile fModel = new ModelClassFile("StudentDB.csv");
//        fModel.saveAllStudentToFile(students);


//        ModelClassList modelList = new ModelClassList(students);
//        ViewClass view = new ViewClass();

//        iGetModel modelList = fModel;//new ModelClassList(students);
//        iGetView view = new ViewClass();

        iGetModel modelList = new ModelClassHash(studMap);
        iGetView view = new ViewClassEng();

        ControllerClass controller = new ControllerClass(modelList, view);

        //controller.update();
        controller.run();


    }
}