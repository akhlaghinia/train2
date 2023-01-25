package com.tiddev.train2.studentController;

import com.tiddev.train2.StudentService.StudentService;
import jdk.jfr.StackTrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController("/")
public class StudentController {
    @Autowired
    private StudentService ss;

    @GetMapping("/student/{name}")
    public String getStudent(@PathVariable String name) {
        return ss.getStudent(name);
    }

    @PutMapping("/student")
    public String updateStudent(@RequestBody String name) {
        System.out.println(name);
        return ss.updateStudent(name, 19);
    }
}
