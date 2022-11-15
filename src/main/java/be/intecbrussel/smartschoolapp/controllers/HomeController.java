package be.intecbrussel.smartschoolapp.controllers;

import be.intecbrussel.smartschoolapp.data.ClassTeacher;
import be.intecbrussel.smartschoolapp.data.Student;
import be.intecbrussel.smartschoolapp.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    ClassTeacherService classTeacherService;
    StudentService studentService;
    ParentService parentService;
    TimeTableService timeTableService;
    EmailMessageService emailMessageService;

   /* @GetMapping("/")
    public String homePage(Model model){

        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "home";
    }
    @GetMapping("/getClassTeacherPage")
    public String getClassTeacherPage(Model model){
        ClassTeacher classTeacher = new ClassTeacher();
        model.addAttribute("classTeacher", classTeacher);
        return "home";
    }*/

    @GetMapping("/")
    public String homePage(Model model){
        return "home";
    }



}
