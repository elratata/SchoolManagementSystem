package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Teacher class
 *
 * @author Le Tuan Huy Nguyen
 */
@Getter
@Setter
@EqualsAndHashCode
public class Teacher {
    private String name;
    private Department department;
    private String fname;
    private String lname;
    private String id;
    private static int nextId;
    private Course[] courses;

    /**
     * Constructor for the teacher class
     *
     * @param fname      the teacher's first name
     * @param lname      the teacher's last name
     * @param department the teacher's department
     * @author Le Tuan Huy Nguyen
     */
    public Teacher(String fname, String lname, Department department) {
        nextId++;
        this.id = String.format("T%03d", nextId);
        this.fname = fname;
        this.lname = lname;
        name = fname + " " + lname;
        this.department = department;
        courses = new Course[SchoolManagementSystem.getMAX_COURSE_PER_TEACHER()];
    }

    /**
     * add the course to the teacher's courses
     * @param course the course to be added
     * @author Le Tuan Huy Nguyen
     */
    public void addCourse(Course course){
        if (Utils.getLength(courses) < SchoolManagementSystem.getMAX_COURSE_PER_TEACHER()){
            courses[Utils.getLength(courses)] = course;
        }else {
            System.out.println("Max courses reached");
        }

    }

    /**
     * toString for Teacher
     * @return Teacher string with courses ids
     * @author Le Tuan Huy Nguyen
     */
    @Override
    public String toString() {
        String out = "Teacher{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id='" + id + '\'' +
                ", courses=[";
        int courseCount = Utils.getLength(courses);
        for (var i = 0; i < courseCount; i++) {
            out += courses[i].getId();
            if (i < courseCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "]}";
        return out;
    }
}
