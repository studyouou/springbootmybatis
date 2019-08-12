package org.ougen.smdemo.service;

import org.apache.ibatis.annotations.Param;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.model.Teacher;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:28 2019/7/23
 */
public interface StudentService {
    public List<Student> getAll();

    public List<Teacher> getTeacher(int studentId);

    public Student getOne(int studentId);
}
