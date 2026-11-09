package com.csit321g3._notfound.clutch.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csit321g3._notfound.clutch.entity.AssessmentEntity;
import com.csit321g3._notfound.clutch.repository.AssessmentRepository;

@Service 
public class AssessmentService {
    @Autowired
    AssessmentRepository arepo; 
    //Test
    public AssessmentService() {
    }

    public AssessmentService(AssessmentRepository arepo) {
        this.arepo = arepo;
    }

    // Create
    public AssessmentEntity createAssessment(AssessmentEntity assessment) {
        return arepo.save(assessment);
    }

    // Read 
    public List<AssessmentEntity> getAllAssessments() {
        return arepo.findAll();
    }

    // Update
    public AssessmentEntity putAssessment(int id, AssessmentEntity newAssessmentDetails) {
        AssessmentEntity assessment = new AssessmentEntity();

        try {
            assessment = arepo.findById(id).get();
            assessment.setComponentId(newAssessmentDetails.getComponentId());
            assessment.setTitle(newAssessmentDetails.getTitle());
            assessment.setMaxScore(newAssessmentDetails.getMaxScore());
            assessment.setDueDate(newAssessmentDetails.getDueDate());
            return arepo.save(assessment);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Delete
    public String deleteAssessment(int id){
        String msg = "";
        if(arepo.existsById(id)) {
            arepo.deleteById(id);
            msg = "Assessment deleted successfully";
        } else {
            msg = "Assessment not found with id: " + id;
        }
        return msg;
    }
}