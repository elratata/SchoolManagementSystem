package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * SchoolManagementSystem class
 *
 * @author Le Tuan Huy Nguyen
 */
@Getter
@Setter
@EqualsAndHashCode
public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    @Getter
    private static final int MAX_STUDENT_NUM_PER_COURSE = 5; // Max # of students per course
    private static final int MAX_COURSE_NUM = 30; // Max # of courses per school
    private static final int MAX_NUM_TEACHERS = 20;
    private static final int MAX_DEPT_NUM = 5;
    @Getter
    private final static int MAX_COURSE_TAKEN = 5; // max # of course per student
    @Getter
    private final static int MAX_COURSE_PER_TEACHER = 3; // max # of course per teacher
    private final static int MAX_STUDENT_NUM = 200; // max # of students per school

    /**
     * Constructor for the school management system
     *
     * @author Le Tuan Huy Nguyen
     */
    public SchoolManagementSystem() {
        departments = new Department[MAX_DEPT_NUM];
        students = new Student[MAX_STUDENT_NUM];
        teachers = new Teacher[MAX_NUM_TEACHERS];
        courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Returns a department based on the department ID
     *
     * @param deptID the department ID
     * @return department based on department ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Department findDepartment(String deptID) {
        if (deptID.charAt(0) == 'D' && deptID.length() == 4) {
            String idStr = deptID.substring(1);
            int id = Integer.parseInt(idStr) - 1;
            return departments[id];
        } else {
            System.out.println("Invalid Format");
            return null;
        }
    }

    /**
     * Returns a teacher based on the teacher ID
     *
     * @param teacherID the teacher ID
     * @return teacher based on teacher ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Teacher findTeacher(String teacherID) {
        if (teacherID.charAt(0) == 'T' && teacherID.length() == 4) {
            String idStr = teacherID.substring(1);
            int id = Integer.parseInt(idStr) - 1;
            return teachers[id];
        } else {
            System.out.println("Invalid Format");
            return null;
        }

    }

    /**
     * Returns a student based on the student ID
     *
     * @param studentID the student ID
     * @return student based on student ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Student findStudent(String studentID) {
        if (studentID.charAt(0) == 'S' && studentID.length() == 4) {
            String idStr = studentID.substring(1);
            int id = Integer.parseInt(idStr) - 1;
            return students[id];
        } else {
            System.out.println("Invalid Format");
            return null;
        }

    }

    /**
     * Returns a course based on the course ID
     *
     * @param courseID the course ID
     * @return course based on course ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Course findCourse(String courseID) {
        if (courseID.charAt(0) == 'C' && courseID.length() == 4) {
            String idStr = courseID.substring(1);
            int id = Integer.parseInt(idStr) - 1;
            return courses[id];
        } else {
            System.out.println("Invalid Format");
            return null;
        }

    }

    /**
     * Prints out every teacher
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printTeachers() {
        for (int i = 0; i < Utils.getLength(teachers); i++) {
            System.out.println(teachers[i]);
        }
    }

    /**
     * Prints out every student
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printStudents() {
        for (int i = 0; i < Utils.getLength(students); i++) {
            System.out.println(students[i]);
        }
    }

    /**
     * Prints out every department
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printDepartments() {
        for (int i = 0; i < Utils.getLength(departments); i++) {
            System.out.println(departments[i]);
        }
    }

    /**
     * Prints out every course
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printCourses() {
        for (int i = 0; i < Utils.getLength(courses); i++) {
            System.out.println(courses[i]);
        }
    }

    /**
     * Adds a department to the system
     *
     * @param deptName the department name
     * @author Le Tuan Huy Nguyen
     */
    public void addDepartment(String deptName) {
        if (Utils.getLength(departments) < MAX_DEPT_NUM) {
            Department department = new Department(deptName);
            departments[Utils.getLength(departments)] = department;
        } else {
            System.out.println("Max department number reached");
        }
    }

    /**
     * Adds a teacher to the system
     *
     * @param fname        their first name
     * @param lname        their last name
     * @param departmentID their department's ID
     * @author Le Tuan Huy Nguyen
     */
    public void addTeacher(String fname, String lname, String departmentID) {
        if (Utils.getLength(teachers) < MAX_NUM_TEACHERS) {
            Department department = findDepartment(departmentID);
            Teacher teacher = new Teacher(fname, lname, department);
            teachers[Utils.getLength(teachers)] = teacher;
        } else {
            System.out.println("Max teacher number reached");
        }
    }

    /**
     * Adds a student to the system
     *
     * @param fname        their first name
     * @param lname        their last name
     * @param departmentID their department's ID
     * @author Le Tuan Huy Nguyen
     */
    public void addStudent(String fname, String lname, String departmentID) {
        if (Utils.getLength(students) < MAX_STUDENT_NUM) {
            Department department = findDepartment(departmentID);
            Student student = new Student(fname, lname, department);
            students[Utils.getLength(students)] = student;
        } else {
            System.out.println("Max student number reached");
        }
    }

    /**
     * Adds a course to the system
     *
     * @param courseName   the course name
     * @param credit       the course credit
     * @param departmentID the department id
     * @author Le Tuan Huy Nguyen
     */
    public void addCourse(String courseName, double credit, String departmentID) {
        if (Utils.getLength(courses) < MAX_COURSE_NUM) {
            Department department = findDepartment(departmentID);
            Course course = new Course(courseName, credit, department);
            courses[Utils.getLength(courses)] = course;
        } else {
            System.out.println("Max course number reached");
        }
    }

    /**
     * Assign or change the teacher for a course
     *
     * @param teacherID the teacher's ID
     * @param courseID  the course ID
     * @author Le Tuan Huy Nguyen
     */
    public void modifyCourseTeacher(String teacherID, String courseID) {
        Teacher teacher = findTeacher(teacherID);
        Course course = findCourse(courseID);
        course.setTeacher(teacher);
        teacher.addCourse(course);
    }

    /**
     * Register a student to a course
     *
     * @param studentID the student's ID
     * @param courseID  the course ID
     * @author Le Tuan Huy Nguyen
     */
    public void registerCourse(String studentID, String courseID) {
        Student student = findStudent(studentID);
        Course course = findCourse(courseID);
        if (student.getCourseNum() < MAX_COURSE_TAKEN) {
            for(int i = 0; i < Utils.getLength(course.getStudents()); i++){
                if (course.getStudents()[i] == student){
                    System.out.println("Already registered");
                    return;
                }
            }
            course.registerStudent(student);
            student.registerCourse(course);
        } else {
            System.out.println("Max number of courses reached");
        }
    }

    /**
     * toString for SchoolManagementSystem
     * @return string for SchoolManagementSystem
     * @author Le Tuan Huy Nguyen
     */
    @Override
    public String toString() {
        String out = "SchoolManagementSystem{" +
                "departments=[";
        int departCount = Utils.getLength(departments);
        for (var i = 0; i < departCount; i++) {
            out += departments[i].getId();
            if (i < departCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "], students=[";
        int studentCount = Utils.getLength(students);
        for (var i = 0; i < studentCount; i++) {
            out += students[i].getId();
            if (i < studentCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "], teachers=[";
        int teacherCount = Utils.getLength(teachers);
        for (var i = 0; i < teacherCount; i++) {
            out += teachers[i].getId();
            if (i < teacherCount - 1) {
                // only comma on elements before last
                out += ", ";
            }
        }
        out += "], courses=[";
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
