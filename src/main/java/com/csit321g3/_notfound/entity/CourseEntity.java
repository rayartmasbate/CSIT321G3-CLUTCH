package com.csit321g3._notfound.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "courses")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long courseId;
    private String courseCode;
    private String courseName;
    private Long creditUnits;
    private String semester;

    public CourseEntity() {}

    public CourseEntity(String courseCode, String courseName, Long creditUnits, String semester) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditUnits = creditUnits;
        this.semester = semester;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditUnits(Long creditUnits) {
        this.creditUnits = creditUnits;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Long getCreditUnits() {
        return creditUnits;
    }

    public String getSemester() {
        return semester;
    }
}
