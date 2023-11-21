package org.tony.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Department of the school
 *
 * @author Le Tuan Huy Nguyen
 */
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Department {
    private String id;
    private String departmentName;
    private static int nextId;
    private static final int MAX_DEPT_NUM = 5;

    /**
     * Constructor for the department
     *
     * @param departmentName the department name
     */
    public Department(String departmentName) {
    }
}
