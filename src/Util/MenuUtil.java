package Util;

import Bean.Config;
import Persons.Student;

import java.util.Scanner;

public class MenuUtil {
    static Scanner sc = new Scanner(System.in);

    public static String requiredType(String title) {
        sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();
    }

    public static int requiredNumber(String title) {
        sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }

    static Student[] students;

    public static void registerStudent() {
        int telebeSayi = requiredNumber("Please enter student sayini");
        students = new Student[telebeSayi];
        Config.students = new Student[telebeSayi];

        for (int i = 0; i < students.length; i++) {
            setInfo(i);
            Student st = students[i];
            Config.students[i] = st;
        }
    }

    public static void setInfo(int sira) {
        students[sira] = new Student();
        students[sira].setName(requiredType("Please enter " + (sira + 1) + ". student name"));
        students[sira].setSurName(requiredType("Please enter " + (sira + 1) + ". student surname"));
        students[sira].setAge(requiredNumber("Please enter " + (sira + 1) + ". student age"));
        students[sira].setClassName(requiredType("Please enter " + (sira + 1) + ". student class name"));
    }


    public static void showALlStudent() {
        for (int i = 0; i < Config.students.length; i++) {
            Config.students[i].printAllStudentsInfo();
        }
    }

    public static void findStudents() {

        String find = requiredType("Please enter name or surname");

        for (int i = 0; i < Config.students.length; i++) {
            if (find.equalsIgnoreCase(Config.students[i].getName())
                    || find.equalsIgnoreCase(Config.students[i].getSurName())) {
                Config.students[i].printAllStudentsInfo();
            }

        }
    }

    public static void updateStudent() {
        showALlStudent();
        int hansiTelebe = requiredNumber("Hansi telebeni deyishmek isteyirsiz?");
        setInfo(hansiTelebe - 1);
        Student st = students[hansiTelebe - 1];
        Config.students[hansiTelebe - 1] = st;

    }
}
