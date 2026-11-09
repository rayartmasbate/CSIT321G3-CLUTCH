package com.csit321g3._notfound.clutch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.csit321g3._notfound.clutch.entity.CourseEntity;
import com.csit321g3._notfound.clutch.service.CourseService;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {
    @Autowired
    CourseService cserv;

    public CourseController() {}

    // Create
    @PostMapping("/createNewCourse")
    public CourseEntity createNewCourse(@RequestBody CourseEntity course) {
        return cserv.createCourse(course);
    }

    // Read
    @GetMapping("/getAllCourses")
    public List<CourseEntity> getAllCourses() {
        return cserv.getAllCourses();
    }

    // Update
    @PutMapping("/updateCourse")
    public CourseEntity updateCourse(@RequestParam Long id, @RequestBody CourseEntity course) {
        return cserv.putCourse(id, course);
    }

    // Delete
    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable Long id) {
        cserv.deleteCourse(id);
    }
}