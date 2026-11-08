package com.csit321g3._notfound.clutch.entity;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity 
@Table(name = "assessments")
public class AssessmentEntity {
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)

    private Long assessmentId;
    private Long componentId;
    private String title;
    private Double maxScore;
    private LocalDateTime dueDate;

    public AssessmentEntity() {}
    public AssessmentEntity(Long componentId, String title, Double maxScore, LocalDateTime dueDate) {
        this.componentId = componentId;
        this.title = title;
        this.maxScore = maxScore;
        this.dueDate = dueDate;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    
    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public Double getMaxScore() {
        return maxScore;
    }
    public String getTitle() {
        return title;
    }
    public Long getComponentId() {
        return componentId;
    }
    public Long getAssessmentId() {
        return assessmentId;
    }
    
    
}
