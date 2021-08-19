package com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.controller;

import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.model.Instructor;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
public class InstructorController {
    private InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public ResponseEntity<List<Instructor>> getAllInstructors(){
        return new ResponseEntity<>(
                instructorService.findAll(),
                HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Instructor> getInstructor(@PathVariable Long id){
        return new ResponseEntity<>(
                instructorService.findById(id),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createInstructor(@RequestBody Instructor instructor){
        instructorService.save(instructor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
