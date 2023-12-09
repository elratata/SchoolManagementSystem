package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Course class
 *
 * @author Le Tuan Huy Nguyen
 */
@ToString
@EqualsAndHashCode
@Setter
@Getter
public class Course {
    private Teacher teacher;
    private String courseName;
    private Student[] students;
    private double credit;
    private int studentNum;
    private Department department;
    private String id;
    private static int nextId;

    public Course(String courseName, double credit, Department department) {
        nextId++;
        this.id = String.format("C%03d", nextId);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.students = new Student[SchoolManagementSystem.getMAX_STUDENT_NUM_PER_COURSE()];
    }

    public void registerStudent(Student student, int index) {
        if (Utils.getLength(student.getCourses()) < SchoolManagementSystem.getMAX_COURSE_TAKEN()) {
            students[index] = student;
            student.setCourseNum(student.getCourseNum() + 1);
        } else {
            System.out.println("Max number of courses reached");
        }
    }
}
