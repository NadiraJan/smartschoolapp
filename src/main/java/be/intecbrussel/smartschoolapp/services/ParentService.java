package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.Parent;
import be.intecbrussel.smartschoolapp.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;


    public List<Parent> getAllParent() {
        return parentRepository.findAll();
    }

    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }


    public Parent getParentById(Long id) {
        return parentRepository.findById(id).get();
    }


    public Parent updateParent(Parent parent) {
        return parentRepository.save(parent);
    }


    public void deleteParentById(Long id) {
        parentRepository.deleteById(id);
    }
}
