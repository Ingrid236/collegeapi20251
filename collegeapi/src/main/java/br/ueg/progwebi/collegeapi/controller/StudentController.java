package br.ueg.progwebi.collegeapi.controller;

import br.ueg.progwebi.collegeapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")

public class StudentController {

    @GetMapping
    public List<Student> listAll (){
        Student student1 = new Student();
        student1.setId(1L);
        student1.setName("Student1");
        student1.setRegisterNumber("123");
        student1.setCourse("SI");
        student1.setRegisterDate(LocalDate.now());

        Student student2 = Student.builder()
                .id(2L)
                .name("Student2")
                .registerNumber("456")
                .course("SI")
                .registerDate(LocalDate.now())
                .build();

        List<Student> students = Arrays.asList(student1, student2);

        return students;

    }
}
