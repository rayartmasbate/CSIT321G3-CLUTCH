package com.csit321g3._notfound.clutch.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g3._notfound.clutch.entity.EnrollmentEntity;
import com.csit321g3._notfound.clutch.repository.EnrollmentRepository;

@Service 
public class EnrollmentService {
    @Autowired
    EnrollmentRepository erepo; 

    public EnrollmentService() {
    }

    public EnrollmentService(EnrollmentRepository erepo) {
        this.erepo = erepo;
    }

    //Create
    public EnrollmentEntity createEnrollment(EnrollmentEntity enrollment) {
        return erepo.save(enrollment);
    }

    //Read 
    public List<EnrollmentEntity> getAllEnrollments() {
        return erepo.findAll();
    }

    //Update
    public EnrollmentEntity putEnrollment(int id, EnrollmentEntity newEnrollmentDetails) {
        EnrollmentEntity enrollment = new EnrollmentEntity();

        try {
            enrollment = erepo.findById(id).get(); 
            enrollment.setStudentId(newEnrollmentDetails.getStudentId());
            enrollment.setCourseId(newEnrollmentDetails.getCourseId());
            enrollment.setEnrollmentDate(newEnrollmentDetails.getEnrollmentDate());
            return erepo.save(enrollment);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //Delete
    public String deleteEnrollment(int id){
        String msg = "";
        if(erepo.existsById(id)) {
            erepo.deleteById(id);
            msg = "Enrollment deleted successfully";
        } else {
            msg = "Enrollment not found with id: " + id;
        }
        return msg;
    }
    
}