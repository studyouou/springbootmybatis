package org.ougen.smdemo.controller;

import org.ougen.smdemo.model.Model;
import org.ougen.smdemo.model.Student;
import org.ougen.smdemo.service.StudentService;
import org.ougen.smdemo.service.TeacherService;
import org.ougen.smdemo.util.ModelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Author: OuGen
 * Discription:
 * Date: 9:35 2019/7/23
 */
@Controller
public class BasicController extends MappingJackson2JsonView {
    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/student/{studentId}")
    public Model getStudent(@PathVariable("studentId") int studentId){
        Student one = studentService.getOne(studentId);
        return ModelUtil.getModel("获得学生",1,one.getStudentId()+one.getStudentName());
    }

    @PostMapping("/student/{studentId}/teacher")
    public ModelAndView getStudentTeacher(@PathVariable("studentId") int studentId){
        Student one = studentService.getOne(studentId);
        Student two = studentService.getOne(studentId);
        ModelAndView mav = new ModelAndView("basicController");
        mav.getModelMap().put("model",ModelUtil.getModel("获得学生",1,one));
        return mav;
    }
    @RequestMapping("/beanNameUrl")
    public ModelAndView getBean(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("basicController");
        return modelAndView;
    }
}
