package org.ougen.smdemo.service;

import org.apache.ibatis.annotations.Param;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.model.Teacher;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:30 2019/7/23
 */
public interface TeacherService {
    public List<Teacher> getTeacherAll();

    public List<Student> getStudentByTeacherId(int teacherId);

    public Teacher getTeacherById(int teacherId);
}
