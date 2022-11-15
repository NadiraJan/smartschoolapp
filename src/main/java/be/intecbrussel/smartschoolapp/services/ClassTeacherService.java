package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.ClassTeacher;
import be.intecbrussel.smartschoolapp.repositories.ClassTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTeacherService {

    @Autowired
    private ClassTeacherRepository classTeacherRepository;

    public List<ClassTeacher> getAllClassTeachers(){
        return classTeacherRepository.findAll();
    }

    public void save(ClassTeacher classTeacher) {
         classTeacherRepository.save(classTeacher);
    }


    public ClassTeacher getClassTeacherById(Long id) {
        return classTeacherRepository.findById(id).get();
    }

    public ClassTeacher updateClassTeacher(ClassTeacher classTeacher) {
        return classTeacherRepository.save(classTeacher);
    }


    public void deleteClassTeacherById(Long id) {
        classTeacherRepository.deleteById(id);
    }



}
