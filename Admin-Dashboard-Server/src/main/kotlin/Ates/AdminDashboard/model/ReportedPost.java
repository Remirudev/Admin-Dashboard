package Ates.AdminDashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class ReportedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reportID;

    private Long reportedPost;

    private Long userID;
    private String kommentar;
    private String reason;
    private Date reportTime ;

    private Boolean bearbeitet;

    public Long getReportID() {
        return reportID;
    }

    public void setReportID(Long reportID) {
        this.reportID = reportID;
    }

    public Long getReportedPost() {
        return reportedPost;
    }

    public void setReportedPost(Long reportedPost) {
        this.reportedPost = reportedPost;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Boolean getBearbeitet() {
        return bearbeitet;
    }

    public void setBearbeitet(Boolean bearbeitet) {
        this.bearbeitet = bearbeitet;
    }
}
