package Ates.AdminDashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Mediafile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mediaID;
    private String mediafile;
    private Long userID;

    @CreationTimestamp
    private Date uploadTime;

    public Mediafile(String mediafile, Long userID, Date uploadTime) {
        this.mediafile = mediafile;
        this.userID = userID;
        this.uploadTime = uploadTime;
    }

    public Mediafile() {

    }

    public Long getMediaID() {
        return mediaID;
    }

    public void setMediaID(Long mediaID) {
        this.mediaID = mediaID;
    }

    public String getMediafile() {
        return mediafile;
    }

    public void setMediafile(String mediafile) {
        this.mediafile = mediafile;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}
