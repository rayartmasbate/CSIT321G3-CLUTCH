package com.csit321g3._notfound.clutch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class EnrollmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long enrollmentId;
    private Long userId;
    private Long courseId;
    private Double currentGrade;
    private Double targetGrade;

    // Default Constructor
    public EnrollmentEntity() {
    }

    // Parameterized Constructor
    public EnrollmentEntity(Long enrollmentId, Long userId, Long courseId, Double currentGrade, Double targetGrade, EnrollmentStatus status) {
        this.enrollmentId = enrollmentId;
        this.userId = userId;
        this.courseId = courseId;
        this.currentGrade = currentGrade;
        this.targetGrade = targetGrade;
        this.status = status;
    }

    // Getters and Setters
    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Double getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(Double currentGrade) {
        this.currentGrade = currentGrade;
    }

    public Double getTargetGrade() {
        return targetGrade;
    }

    public void setTargetGrade(Double targetGrade) {
        this.targetGrade = targetGrade;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}