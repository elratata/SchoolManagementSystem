package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Course class
 *
 * @author Le Tuan Huy Nguyen
 */
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

    /**
     * Constructor for the course
     *
     * @param courseName name of the course
     * @param credit     the number of credit
     * @param department the department
     */
    public Course(String courseName, double credit, Department department) {
        nextId++;
        this.id = String.format("C%03d", nextId);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.students = new Student[SchoolManagementSystem.getMAX_STUDENT_NUM_PER_COURSE()];
    }

    /**
     * toString method to prevent StackOverflowError from the courses and students calling each other back and forth
     *
     * @return Course string, with the students being the student ids
     * @author Le Tuan Huy Nguyen
     */
    @Override
    public String toString() {
        String out = "Course{" +
                "teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                ", students=String[";

        int studentCount = Utils.getLength(students);
        for (var i = 0; i < studentCount; i++) {
            out += students[i].getId();
            if (i < studentCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "]" +
                ", credit=" + credit +
                ", studentNum=" + studentNum +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';

        return out;
    }

    /**
     * register a student to the students list
     *
     * @param student The student
     * @author Le Tuan Huy Nguyen
     */
    public void registerStudent(Student student) {
        students[Utils.getLength(students)] = student;
    }
}
