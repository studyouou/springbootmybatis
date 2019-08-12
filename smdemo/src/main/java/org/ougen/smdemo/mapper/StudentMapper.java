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
public interface StudentMapper {

    public List<Student> getAll();

    public List<Teacher> getTeacher(@Param("studentId") int studentId);

    public Student getOne(@Param("studentId") int studentId);

    //public List<MyEnum> getMyEnum(@Param("myEnum") MyEnum myEnum);
}
