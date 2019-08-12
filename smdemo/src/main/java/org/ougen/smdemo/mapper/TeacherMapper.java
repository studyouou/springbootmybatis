package org.ougen.smdemo.mapper;

import org.apache.ibatis.annotations.Param;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.model.Teacher;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 17:26 2019/7/22
 */
public interface TeacherMapper {
    public List<Teacher> getTeacherAll();

    public List<Student> getStudentByTeacherId(@Param("teacherId")int teacherId);

    public Teacher getTeacherById(@Param("teacherId")int teacherId);
}
