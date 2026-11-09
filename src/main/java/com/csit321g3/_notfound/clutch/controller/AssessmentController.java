package com.csit321g3._notfound.clutch.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.csit321g3._notfound.clutch.entity.AssessmentEntity;
import com.csit321g3._notfound.clutch.service.AssessmentService;

@RestController 
@RequestMapping ("/api/assessments")
@CrossOrigin(origins = "http://localhost:3000")
public class AssessmentController {
    @Autowired 
    AssessmentService aserv;

    public AssessmentController() {}

    //Create
    @PostMapping("/createNewAssessment")    
    public AssessmentEntity createNewAssessment(@RequestBody AssessmentEntity assessment) {
        return aserv.createAssessment(assessment);
    }

    //Read
    @GetMapping("/getAllAssessments")
    public List<AssessmentEntity> getAllAssessments() {
        return aserv.getAllAssessments();
    }

    //Update
    @PutMapping("/updateAssessment")
    public AssessmentEntity updateAssessment(@RequestParam int assessmentId, @RequestBody AssessmentEntity assessment) {
        return aserv.putAssessment(assessmentId, assessment);
    }

    //Delete
    @DeleteMapping("/deleteAssessment/{assessmentId}")
    public String deleteAssessment(@PathVariable int assessmentId) {
        return aserv.deleteAssessment(assessmentId);
    }
    
    
}
