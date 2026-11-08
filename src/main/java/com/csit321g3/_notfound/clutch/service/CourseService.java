package com.csit321g3._notfound.clutch.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csit321g3._notfound.clutch.entity.CourseEntity;
import com.csit321g3._notfound.clutch.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository crepo;

    public CourseService() {}

    // Create
    public CourseEntity createCourse(CourseEntity course) {
        return crepo.save(course);
    }

    // Read
    public List<CourseEntity> getAllCourses() {
        return crepo.findAll();
    }

    // Update
    public CourseEntity putCourse(Long id, CourseEntity newCourseDetails) {
        CourseEntity course = new CourseEntity();

        try {
            course = crepo.findById(id).get();
            course.setCourseCode(newCourseDetails.getCourseCode());
            course.setCourseName(newCourseDetails.getCourseName());
            course.setCreditUnits(newCourseDetails.getCreditUnits());
            course.setSemester(newCourseDetails.getSemester());
            return crepo.save(course);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Delete
    public String deleteCourse(Long id) {
        if(crepo.existsById(id)) {
            crepo.deleteById(id);
            return "Course deleted successfully";
        } else {
            return "Course not found with id: " + id;
        }
    }
}