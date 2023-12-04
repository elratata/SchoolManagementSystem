package org.tony;

import org.tony.dto.Course;
import org.tony.dto.Department;
import org.tony.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();

        system.addDepartment("yo");
        system.addDepartment("yes");
        system.addDepartment("yo");
        system.addDepartment("yo");
        system.addDepartment("yo");

        system.addTeacher("jimmy", "john", "D002");
        system.addStudent("jonas", "jones", "D002");
        system.addCourse("Introduction to yoyoing", 4, "D002");

        system.registerCourse("S001", "C001");
        System.out.println(system.findDepartment("D003"));
        System.out.println(system.findTeacher("T001"));
        System.out.println(system.findStudent("S001"));
        System.out.println(system.findCourse("C001"));
    }
}