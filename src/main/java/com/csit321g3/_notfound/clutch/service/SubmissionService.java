package com.csit321g3._notfound.clutch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g3._notfound.clutch.repository.SubmissionRepository;
import com.csit321g3._notfound.clutch.entity.SubmissionEntity;

@Service
public class SubmissionService {

    @Autowired
    SubmissionRepository subRepo;

    public SubmissionService(SubmissionRepository subRepo) {
        this.subRepo = subRepo;
    }

    public SubmissionEntity postSubmission(SubmissionEntity submission) {
        return subRepo.save(submission);
    }

    public List<SubmissionEntity> getAllSubmissions() {
        return subRepo.findAll();
    }

    public SubmissionEntity getSubmissionById(Long id) {
        try {
            return subRepo.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public SubmissionEntity putSubmission(Long id, SubmissionEntity newSubmissionDetails) {
        try {
            SubmissionEntity submission = subRepo.findById(id).get();

            submission.setAssessmentId(newSubmissionDetails.getAssessmentId());
            submission.setUserId(newSubmissionDetails.getUserId());
            submission.setScoreObtained(newSubmissionDetails.getScoreObtained());
            submission.setFeedbackText(newSubmissionDetails.getFeedbackText());
            submission.setFilePath(newSubmissionDetails.getFilePath());
            submission.setGradedAt(newSubmissionDetails.getGradedAt());

            return subRepo.save(submission);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // D - Delete Submission (Using Try-Catch)
    public String deleteSubmission(Long id) {
        try {
            SubmissionEntity submission = subRepo.findById(id).get();
            subRepo.delete(submission);
            return "Submission " + id + " is successfully deleted!";
        } catch (Exception e) {
            return "Submission " + id + " does not exist!";
        }
    }
}