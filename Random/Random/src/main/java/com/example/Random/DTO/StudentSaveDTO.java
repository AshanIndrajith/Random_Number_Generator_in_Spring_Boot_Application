package com.example.Random.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class StudentSaveDTO {


    private int studentid;
    private String studentname;
    private String address;
    private String mobile;
    private boolean active;
}
