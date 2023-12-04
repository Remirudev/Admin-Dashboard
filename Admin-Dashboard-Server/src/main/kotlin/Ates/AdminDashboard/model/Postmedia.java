package Ates.AdminDashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Postmedia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postmedia;
    private Long postID;
    private Long mediaID;

    public Long getPostmedia() {
        return postmedia;
    }

    public void setPostmedia(Long postmedia) {
        this.postmedia = postmedia;
    }

    public Long getPostID() {
        return postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public Long getMediaID() {
        return mediaID;
    }

    public void setMediaID(Long mediaID) {
        this.mediaID = mediaID;
    }
}
