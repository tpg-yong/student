/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpg.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Test class to sort students by GPA and name lexicographically if the GPA are
 * the same.
 *
 */
public class Main {

    private static final List<Student> students = new ArrayList<>();

    public Main() {
        Student tina = new Student(33, "Tina", 3.68);
        Student louis = new Student(85, "Louis", 3.85);
        Student samil = new Student(56, "Samil", 3.75);
        Student samar = new Student(19, "Samar", 3.75);
        Student lorry = new Student(22, "Lorry", 3.76);
        students.add(tina);
        students.add(louis);
        students.add(samil);
        students.add(samar);
        students.add(lorry);
    }

    public void showTopStudents() {
        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() > o2.getGpa() ? -1 : (o1.getGpa() < o2.getGpa() ? 1 : o1.getName().compareTo(o2.getName()));
            }
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showTopStudents();
    }
}
