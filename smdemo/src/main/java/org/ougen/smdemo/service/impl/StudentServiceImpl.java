package org.ougen.smdemo.service.impl;

import org.ougen.smdemo.mapper.StudentMapper;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.model.Teacher;
import org.ougen.smdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:28 2019/7/23
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public List<Teacher> getTeacher(int studentId) {
        return studentMapper.getTeacher(studentId);
    }

    @Override
    @Transactional
    public Student getOne(int studentId) {
        return studentMapper.getOne(studentId);
    }
}
