package com.csit321g3._notfound.clutch.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.csit321g3._notfound.clutch.entity.EnrollmentEntity;
import com.csit321g3._notfound.clutch.service.EnrollmentService;




@RestController 
@RequestMapping ("/api/enrollments")
public class EnrollmentController {
    @Autowired 
    EnrollmentService eserv;

    public EnrollmentController() {}

    //Create
    @PostMapping("/createNewEnrollment")
    public EnrollmentEntity createNewEnrollment(@RequestBody EnrollmentEntity enrollment) {
        return eserv.createEnrollment(enrollment);
    }

    //Read
    @GetMapping("/getAllEnrollments")   
    public List<EnrollmentEntity> getAllEnrollments() {
        return eserv.getAllEnrollments();
    }

    //Update
    @PutMapping("/updateEnrollment")
    public EnrollmentEntity updateEnrollment(@RequestParam int enrollmentId, @RequestBody EnrollmentEntity enrollment) {
        return eserv.putEnrollment(enrollmentId, enrollment);
    }

    //Delete
    @DeleteMapping("/deleteEnrollment/{enrollmentId}")
    public String deleteEnrollment(@PathVariable int enrollmentId) {
        return eserv.deleteEnrollment(enrollmentId);
    }
    
}
