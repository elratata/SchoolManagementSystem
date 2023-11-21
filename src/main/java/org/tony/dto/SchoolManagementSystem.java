package org.tony.dto;

public class SchoolManagementSystem {
    public SchoolManagementSystem() {
    }

    /**
     * Returns a department based on the department ID
     * @param deptID the department ID
     * @return department based on department ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Department findDepartment(String deptID){
        return new Department();
    }

    /**
     * Returns a teacher based on the teacher ID
     * @param teacherID the teacher ID
     * @return teacher based on teacher ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Teacher findTeacher(String teacherID){
        return new Teacher();
    }

    /**
     * Returns a student based on the student ID
     * @param studentID the student ID
     * @return student based on student ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Student findStudent(String studentID){
        return new Student();
    }

    /**
     * Returns a course based on the course ID
     * @param courseID the course ID
     * @return course based on course ID, null if not found
     * @author Le Tuan Huy Nguyen
     */
    public Course findCourse(String courseID){
        return new Course();
    }

    /**
     * Prints out every teacher
     * @author Le Tuan Huy Nguyen
     */
    public void printTeachers(){
        return;
    }

    /**
     * Prints out every student
     * @author Le Tuan Huy Nguyen
     */
    public void printStudents(){
        return;
    }

    /**
     * Prints out every department
     * @author Le Tuan Huy Nguyen
     */
    public void printDepartments(){
        return;
    }

    /**
     * Prints out every course
     * @author Le Tuan Huy Nguyen
     */
    public void printCourse(){
        return;
    }

    /**
     * Adds a department to the system
     * @param deptName the department name
     * @author Le Tuan Huy Nguyen
     */
    public void addDepartment(String deptName){
        return;
    }

    /**
     * Adds a teacher to the system
     * @param fname their first name
     * @param lname their last name
     * @param departmentID their department's ID
     * @author Le Tuan Huy Nguyen
     */
    public void addTeacher(String fname, String lname, String departmentID){
        return;
    }

    /**
     * Adds a student to the system
     * @param fname their first name
     * @param lname their last name
     * @param departmentID their department's ID
     * @author Le Tuan Huy Nguyen
     */
    public void addStudent(String fname, String lname, String departmentID){
        return;
    }

    /**
     * Adds a course to the system
     * @param courseName the course name
     * @param credit the course credit
     * @param department the department
     * @author Le Tuan Huy Nguyen
     */
    public void addCourse(String courseName, double credit, Department department){
        return;
    }

    /**
     * Assign or change the teacher for a course
     * @param teacherID the teacher's ID
     * @param courseID the course ID
     * @author Le Tuan Huy Nguyen
     */
    public void modifyCourseTeacher(String teacherID, String courseID){
        return;
    }

    /**
     * Register a student to a course
     * @param studentID the student's ID
     * @param courseID the course ID
     * @author Le Tuan Huy Nguyen
     */
    public void registerCourse(String studentID, String courseID){
        return;
    }
}
