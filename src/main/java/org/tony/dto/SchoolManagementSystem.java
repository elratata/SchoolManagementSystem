package org.tony.dto;

import java.util.Arrays;

/**
 * SchoolManagementSystem class
 *
 * @author Le Tuan Huy Nguyen
 */
public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    /**
     * Constructor for the school management system
     *
     * @author Le Tuan Huy Nguyen
     */
    public SchoolManagementSystem() {
        departments = new Department[Department.getMAX_DEPT_NUM()];
        students = new Student[Student.getMAX_STUDENT_NUM()];
        teachers = new Teacher[Teacher.getMAX_NUM_TEACHERS()];
        courses = new Course[Course.getMAX_COURSE_NUM()];
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
        return;
    }

    /**
     * Prints out every student
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printStudents() {
        return;
    }

    /**
     * Prints out every department
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printDepartments() {
        return;
    }

    /**
     * Prints out every course
     *
     * @author Le Tuan Huy Nguyen
     */
    public void printCourse() {
        return;
    }

    /**
     * Adds a department to the system
     *
     * @param deptName the department name
     * @author Le Tuan Huy Nguyen
     */
    public void addDepartment(String deptName) {
        if (Utils.getLength(departments) < Department.getMAX_DEPT_NUM()) {
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
        if (Utils.getLength(teachers) < Teacher.getMAX_NUM_TEACHERS()) {
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
        if (Utils.getLength(students) < Student.getMAX_STUDENT_NUM()) {
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
        if (Utils.getLength(courses) < Course.getMAX_COURSE_NUM()) {
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
        System.out.println(course);
        for(int i = 0; i < course.getStudents().length; i++){
            if (course.getStudents()[i] == null){
                course.registerStudent(student, i);
            }
        }
    }
}
