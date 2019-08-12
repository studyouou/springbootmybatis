package org.ougen.smdemo.service.impl;

import org.ougen.smdemo.mapper.TeacherMapper;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.model.Teacher;
import org.ougen.smdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:32 2019/7/23
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeacherAll() {
        return teacherMapper.getTeacherAll();
    }

    @Override
    public List<Student> getStudentByTeacherId(int teacherId) {
        return teacherMapper.getStudentByTeacherId(teacherId);
    }

    @Override
    public Teacher getTeacherById(int teacherId) {
        return teacherMapper.getTeacherById(teacherId);
    }
}
