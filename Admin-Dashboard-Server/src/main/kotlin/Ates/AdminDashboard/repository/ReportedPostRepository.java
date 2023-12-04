package Ates.AdminDashboard.repository;

import Ates.AdminDashboard.model.ReportedPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportedPostRepository extends JpaRepository<ReportedPost, Long> {
    void deleteReportedPostByReportID(Long reportID);

    ReportedPost findReportedPostByReportID(Long reportID);
}
