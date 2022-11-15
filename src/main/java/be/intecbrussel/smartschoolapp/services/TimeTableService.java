package be.intecbrussel.smartschoolapp.services;

import be.intecbrussel.smartschoolapp.data.Student;
import be.intecbrussel.smartschoolapp.data.TimeTable;
import be.intecbrussel.smartschoolapp.repositories.TimeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTableService {
    @Autowired
    private TimeTableRepository timeTableRepository;


    public TimeTable save(TimeTable timeTable){
        return timeTableRepository.save(timeTable);

    }
    public List<TimeTable> getAllTimeTables(){
        return timeTableRepository.findAll();
    }

    public TimeTable getTimeTableById(Long id){
        return timeTableRepository.findById(id).get();
    }

    public TimeTable updateTimeTable(TimeTable timeTable){
        return timeTableRepository.save(timeTable);
    }

    public void deleteTimeTableById(Long id){
        timeTableRepository.deleteById(id);
    }
}
