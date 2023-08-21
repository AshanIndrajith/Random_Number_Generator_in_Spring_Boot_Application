package com.example.Random.Controller;


import com.example.Random.DTO.StudentSaveDTO;
import com.example.Random.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class Controller {


    @Autowired
    private StudentService studentService;

    @PostMapping(path="/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO)
    {
        String id= studentService.addStudent(studentSaveDTO);
        return id;
    }
}
