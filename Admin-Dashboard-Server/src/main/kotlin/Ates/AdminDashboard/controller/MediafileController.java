package Ates.AdminDashboard.controller;

import Ates.AdminDashboard.model.Mediafile;
import Ates.AdminDashboard.service.MediafileService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Mediafile")
public class MediafileController {
    private final MediafileService mediafileService;

    public MediafileController(MediafileService mediafileService) {
        this.mediafileService = mediafileService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Mediafile> getMediafileById (@PathVariable("id") Long id) {
        Mediafile mediafile = mediafileService.findMediafileByMediaID(id);
        return new ResponseEntity<>(mediafile, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mediafile>> getAllMediafiles () {
        List<Mediafile> mediafiles = mediafileService.findAllMediafiles();
        return new ResponseEntity<>(mediafiles, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Mediafile> addMediafile (@RequestBody Mediafile mediafile) {
        Mediafile newMediafile = mediafileService.addMediafile(mediafile);
        return new ResponseEntity<>(newMediafile, HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Mediafile> deleteMediafile (@PathVariable("id") Long id) {
        mediafileService.deleteMediafile(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
