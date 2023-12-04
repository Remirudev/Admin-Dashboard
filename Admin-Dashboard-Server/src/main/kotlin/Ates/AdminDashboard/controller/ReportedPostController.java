package Ates.AdminDashboard.controller;

import Ates.AdminDashboard.model.Post;
import Ates.AdminDashboard.model.ReportedPost;
import Ates.AdminDashboard.service.ReportedPostService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Reports")
public class ReportedPostController {

    private final ReportedPostService reportedPostService;

    public ReportedPostController(ReportedPostService reportedPostService) {
        this.reportedPostService = reportedPostService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReportedPost>> getAllReportedPosts() {
        List<ReportedPost> reportedPosts = reportedPostService.findAllReportedPosts();
        return new ResponseEntity<>(reportedPosts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ReportedPost> getReportedPost(@PathVariable("id") Long id) {
        ReportedPost reportedPost = reportedPostService.findReportedPostByReportID(id);
        return new ResponseEntity<>(reportedPost, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ReportedPost> addReportedPost(@RequestBody ReportedPost reportedPost) {
        ReportedPost newReportedPosts = reportedPostService.addReportedPost(reportedPost);
        return new ResponseEntity<>(newReportedPosts, HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ReportedPost> deleteReportedPost(@PathVariable("id") Long id) {
        reportedPostService.deleteReportedPost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ReportedPost> updateReportedPost(@RequestBody ReportedPost reportedPost) {
        ReportedPost updateReportedPost = reportedPostService.updateReportedPost(reportedPost);
        return new ResponseEntity<>(updateReportedPost, HttpStatus.OK);
    }
}
