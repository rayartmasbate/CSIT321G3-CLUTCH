package com.csit321g3._notfound.clutch.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.csit321g3._notfound.clutch.service.SubmissionService;
import com.csit321g3._notfound.clutch.entity.SubmissionEntity;

@RestController
@RequestMapping("/api/submissions")
@CrossOrigin(origins = "http://localhost:3000")
public class SubmissionController {

    @Autowired
    SubmissionService subServ;

    public SubmissionController() { 

    }

    public SubmissionController(SubmissionService subServ) {
        this.subServ = subServ;
    }

    @PostMapping("/postNewSubmission")
    public SubmissionEntity postSubmission(@RequestBody SubmissionEntity submission) {
        return subServ.postSubmission(submission);
    }

    @GetMapping("/getAllSubmissions")
    public List<SubmissionEntity> getAllSubmissions() {
        return subServ.getAllSubmissions();
    }

    @GetMapping("/getSubmission/{id}")
    public SubmissionEntity getSubmissionById(@PathVariable Long id) {
        return subServ.getSubmissionById(id);
    }

    @PutMapping("/putSubmission")
    public SubmissionEntity putSubmission(@RequestParam Long id, @RequestBody SubmissionEntity newSubmissionDetails) {
        return subServ.putSubmission(id, newSubmissionDetails);
    }

    @DeleteMapping("/deleteSubmission/{id}")
    public String deleteSubmission(@PathVariable Long id) {
        return subServ.deleteSubmission(id);
    }

}
