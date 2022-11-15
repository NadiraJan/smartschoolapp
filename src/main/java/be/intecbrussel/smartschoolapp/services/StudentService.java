package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.Student;
import be.intecbrussel.smartschoolapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);

    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id){
         studentRepository.deleteById(id);
    }
}
