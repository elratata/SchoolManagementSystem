package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Student class
 *
 * @author Le Tuan Huy Nguyen
 */
@Getter
@Setter
@ToString
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
    @Getter
    private final static int MAX_COURSE_TAKEN = 5; // max # of course per student
    @Getter
    private final static int MAX_STUDENT_NUM = 200; // max # of students per school

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
    }
}
