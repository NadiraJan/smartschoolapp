package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.Results;
import be.intecbrussel.smartschoolapp.data.Student;
import be.intecbrussel.smartschoolapp.repositories.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class ResultsService {
    @Autowired
    private ResultsRepository resultsRepository;


    public Results save(Results results){
        return resultsRepository.save(results);

    }
    public List<Results> getAllResults(){
        return resultsRepository.findAll();
    }

    public Results getResultsById(Long id){
        return resultsRepository.findById(id).get();
    }

    public Results updateResults(Results results){
        return resultsRepository.save(results);
    }

    public void deleteResultsById(Long id){
        resultsRepository.deleteById(id);
    }
}
