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

    @Getter
    private static final int MAX_STUDENT_NUM_PER_COURSE = 5; // Max # of students per course
    @Getter
    private static final int MAX_COURSE_NUM = 30; // Max # of courses per school

    public Course(String courseName, double credit, Department department) {
        nextId++;
        this.id = String.format("C%03d", nextId);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }
}
