package SeminarsOOP.Mvcstudentapp.Model;

import SeminarsOOP.Mvcstudentapp.Controller.Interfaces.iGetModel;
import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для оипсания модуля хранящего данные в файле
 */
public class ModelClassFile implements iGetModel {
    /**
     * имя файла с данными
     */
    private String fileName;

    public ModelClassFile(String fileName) {
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод получения списка студетов из файла
     * @return
     */
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]));
                students.add(pers);
                pers.setId(Integer.parseInt(param[2]));
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    @Override
    /**
     * метод удаления студента из файла
     */
    public void delStudent(int id) throws FileNotFoundException {
        List<Student> stdList = new ArrayList<>(this.getStudents());
        boolean flag = false;
        for (Student std : stdList) {
            if (std.getId() == id) {
                stdList.remove(std);
                System.out.println("Студент " + std + " удален");
                flag = true;
                this.saveAllStudentToFile(stdList);
                break;
            }
        }
        if (flag == false) {
            System.out.println("Студент с таким id  не найден");
        }
    }

    /**
     * метод сохранения списка студентов в файл
     *
     * @param students спиоск студентов
     */
    public void saveAllStudentToFile(List<Student> students) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student pers : students) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}