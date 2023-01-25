package com.tiddev.train2.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String getStudent(String student){
        return "Hello dear " + student;
    }
    public String updateStudent(String student, int score){
        score++;
        return student + score ;
    }
}