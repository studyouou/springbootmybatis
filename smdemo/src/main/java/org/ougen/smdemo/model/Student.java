package org.ougen.smdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 17:15 2019/7/22
 */
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Student implements Serializable {
    private int studentId;
    private String studentName;
    private List<Teacher> teacher_list;

}
