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

    /**
     * Constructor for the department
     *
     * @param departmentName the department name
     * @author Le Tuan Huy Nguyen
     */
    public Department(String departmentName) {
        nextId++;
        this.id = String.format("D%03d", nextId);
        this.departmentName = departmentName;
    }
}
