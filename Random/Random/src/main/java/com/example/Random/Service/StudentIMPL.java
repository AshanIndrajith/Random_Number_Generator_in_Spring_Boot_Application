package com.example.Random.Service;


import com.example.Random.DTO.StudentSaveDTO;
import com.example.Random.Entity.Student;
import com.example.Random.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StudentIMPL implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student =new Student(

                new Random().nextInt(100),

                studentSaveDTO.getStudentname(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getMobile(),
                studentSaveDTO.isActive()
        );

        studentRepo.save(student);
        return student.getStudentname();
    }
}
