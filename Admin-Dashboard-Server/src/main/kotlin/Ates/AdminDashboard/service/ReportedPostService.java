package Ates.AdminDashboard.service;

import Ates.AdminDashboard.model.ReportedPost;
import Ates.AdminDashboard.model.Users;
import Ates.AdminDashboard.repository.ReportedPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportedPostService {

    private final ReportedPostRepository reportedPostRepository;

    @Autowired
    public ReportedPostService(ReportedPostRepository reportedPostRepository) {
        this.reportedPostRepository = reportedPostRepository;
    }

    public ReportedPost addReportedPost(ReportedPost reportedPost) {
        return reportedPostRepository.save(reportedPost);
    }
    public List<ReportedPost> findAllReportedPosts(){
        return reportedPostRepository.findAll();
    }
    public ReportedPost findReportedPostByReportID(Long reportID) {
        return reportedPostRepository.findReportedPostByReportID(reportID);
    }
    public void deleteReportedPost(Long reportID) {
        reportedPostRepository.deleteReportedPostByReportID(reportID);
    }
    public ReportedPost updateReportedPost(ReportedPost reportedPost) {
        return reportedPostRepository.save(reportedPost);
    }
}
