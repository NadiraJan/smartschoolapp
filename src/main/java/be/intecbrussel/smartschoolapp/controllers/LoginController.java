package be.intecbrussel.smartschoolapp.controllers;

import be.intecbrussel.smartschoolapp.data.Student;
import be.intecbrussel.smartschoolapp.dto.LoginDto;
import be.intecbrussel.smartschoolapp.services.ClassTeacherService;
import be.intecbrussel.smartschoolapp.services.ParentService;
import be.intecbrussel.smartschoolapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.Subject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value="/login")
public class LoginController {
    @Autowired
    StudentService studentService;
    @Autowired
    ClassTeacherService classTeacherService;
    @Autowired
    ParentService parentService;

    public LoginController(StudentService studentService,
                           ClassTeacherService classTeacherService,
                           ParentService parentService) {
        this.studentService = studentService;
        this.classTeacherService = classTeacherService;
        this.parentService = parentService;
    }

    @GetMapping("/getLogin")
    public String login(Model model, @ModelAttribute("login") LoginDto loginDto) {
        model.addAttribute("login", loginDto);
        return "login";
    }

    @PostMapping("/postLogin")
    public String login(@ModelAttribute LoginDto loginDto, HttpSession session, HttpServletResponse response) {
        if (loginDto.getRole().equals("student")) {
            List<Student> students = studentService.getAllStudents();
            for (Student student : students) {
                if (student.getId().equals(loginDto.getNo()) && student.getPassword().equals(loginDto.getPassword())) {
                    session.setAttribute("student", student);
                    return "redirect:/student/getStudentPage";
                }
            }
        }
        return "/";
    }
}



