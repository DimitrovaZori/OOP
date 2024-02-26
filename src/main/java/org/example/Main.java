package org.example;

import org.students.HighSchoolStudent;
import org.students.Student;
import org.students.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        //Cat cat = new Cat();
       /* incorrect details
        cat.name ="";
        cat.age = -1000;
        cat.weight = 0;*/
          /*valid details
         cat.setName("Tom");
          cat.setAge(2);
          cat.setWeight(10);

          Cat cat2 = new Cat("Alex",3,80);
        System.out.println(cat.getName());*/

        //StudentManagementSystem
        StudentManagementSystem system = new StudentManagementSystem();

        Student alice = new HighSchoolStudent("Alice",16,"Math",10);
        Student bob = new HighSchoolStudent("Bob",26,"Computer Science",10);

        system.addStudent(alice);
        system.addStudent(bob);
        system.displayAllStudents();

    }
}