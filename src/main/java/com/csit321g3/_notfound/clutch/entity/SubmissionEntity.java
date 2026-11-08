package com.csit321g3._notfound.clutch.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "submissions")
public class SubmissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long submissionId;
    
    private Long assessmentId;
    private Long userId;
    private Double scoreObtained;
    private String feedbackText;
    private String filePath;
    private LocalDateTime gradedAt;

    public SubmissionEntity() {
    }

    public SubmissionEntity(Long assessmentId, Long userId, Double scoreObtained, String feedbackText, String filePath, LocalDateTime gradedAt) {
        this.assessmentId = assessmentId;
        this.userId = userId;
        this.scoreObtained = scoreObtained;
        this.feedbackText = feedbackText;
        this.filePath = filePath;
        this.gradedAt = gradedAt;
    }

    public void setSubmissionId(Long submissionId) {
        this.submissionId = submissionId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setScoreObtained(Double scoreObtained) {
        this.scoreObtained = scoreObtained;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setGradedAt(LocalDateTime gradedAt) {
        this.gradedAt = gradedAt;
    }

    // Getter methods

    public Long getSubmissionId() {
        return submissionId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public Long getUserId() {
        return userId;
    }

    public Double getScoreObtained() {
        return scoreObtained;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public String getFilePath() {
        return filePath;
    }

    public LocalDateTime getGradedAt() {
        return gradedAt;
    }
}
