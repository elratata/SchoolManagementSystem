package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Student class
 *
 * @author Le Tuan Huy Nguyen
 */
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private int nextId;
    private String name;
    private String fname;
    private String lname;
    private int courseNum;
    private Department department;
    private Course[] courses;
    private String id;

    /**
     * Constructor for student
     *
     * @param fname      the student first name
     * @param lname      the student last name
     * @param department the student department
     */
    public Student(String fname, String lname, Department department) {
        nextId++;
        this.id = String.format("S%03d", nextId);
        this.fname = fname;
        this.lname = lname;
        this.name = fname + " " + lname;
        this.department = department;
        this.courses = new Course[SchoolManagementSystem.getMAX_STUDENT_NUM_PER_COURSE()];
    }

    /**
     * toString method to prevent StackOverflowError from the courses and students calling each other back and forth
     *
     * @return Student string, with the courses being the course ids
     * @author Le Tuan Huy Nguyen
     */
    @Override
    public String toString() {
        String out = "Student{" +
                "nextId=" + nextId +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", courseNum=" + courseNum +
                ", department=" + department +
                ", courses=[";

        int courseCount = Utils.getLength(courses);
        for (var i = 0; i < courseCount; i++) {
            out += courses[i].getId();
            if (i < courseCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "]" +
                ", id='" + id + '\'' +
                '}';

        return out;
    }

    /**
     * Register a course to the student's list
     *
     * @param course the course
     * @author Le Tuan Huy Nguyen
     */
    public void registerCourse(Course course) {
        courses[courseNum] = course;
        courseNum++;
    }
}
