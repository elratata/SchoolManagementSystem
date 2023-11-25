package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Teacher class
 *
 * @author Le Tuan Huy Nguyen
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Teacher {
    private String name;
    private Department department;
    private String fname;
    private String lname;
    private String id;
    private static int nextID;
    private final static int MAX_NUM_TEACHERS = 20;

    /**
     * Constructor for the teacher class
     *
     * @param fname      the teacher's first name
     * @param lname      the teacher's last name
     * @param department the teacher's department
     */
    public Teacher(String fname, String lname, Department department) {
    }
}
