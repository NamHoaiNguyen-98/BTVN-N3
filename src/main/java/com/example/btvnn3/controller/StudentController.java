package com.example.btvnn3.controller;

import com.example.btvnn3.model.Filter;
import com.example.btvnn3.model.Student;
import com.example.btvnn3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")

public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ResponseEntity<Iterable<Student>> display() {
        Iterable<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        studentService.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{idStudent}")
    public ResponseEntity<Student> findOne(@PathVariable("idStudent") Long idStudent) {
        Optional<Student> student = studentService.findOne(idStudent);
        if (student.isPresent()) {
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{idStudent}")
    public ResponseEntity<Student> update(@PathVariable("idStudent") Long idStudent,
                                          @RequestBody Student student) {
        Optional<Student> studentOptional = studentService.findOne(idStudent);
        if (studentOptional.isPresent()) {
            student.setIdStudent(idStudent);
            return new ResponseEntity<>(studentService.update(student), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/searchByName")
    public String searchByName(@RequestParam("name") String name,
                               @PageableDefault(value = 2) Pageable pageable,
                               Model model) {
        model.addAttribute("students", studentService.searchByName(name, pageable));
        return "/display";
    }

    @GetMapping("/searchByAddress")
    public String searchByAddress(@RequestParam("address") String address,
                                  @PageableDefault(value = 2) Pageable pageable,
                                  Model model) {
        model.addAttribute("student", studentService.searchByAddress(address, pageable));
        return "/display";
    }

    @GetMapping("/searchByStatus")
    public String searchByStatus(@RequestParam("idStatus") Long id,
                                 @PageableDefault(value = 2) Pageable pageable,
                                 Model model) {
        model.addAttribute("student", studentService.searchByStatus(id, pageable));
        return "/display";
    }
    @GetMapping("/searchBySubject")
    public String searchBySubject(@RequestParam("idSubject") Long id,
                                 @PageableDefault(value = 2) Pageable pageable,
                                 Model model) {
        model.addAttribute("student", studentService.searchBySubject(id, pageable));
        return "/display";
    }
    @GetMapping("/searchByFilter")
    public String searchByFilter(@RequestBody Filter filter,
                                 @PageableDefault(value = 2) Pageable pageable,
                                 Model model) {
        model.addAttribute("student", studentService.searchByFilter(filter, pageable));
        return "/display";
    }

}
