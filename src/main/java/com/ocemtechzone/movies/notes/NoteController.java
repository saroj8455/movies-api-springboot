package com.ocemtechzone.movies.notes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/notes")
public class NoteController {

//    @Autowired
//    private NoteRepository noteRepository;
    @Autowired
    private NoteService noteService;

    private final Logger LOG = LoggerFactory.getLogger(getClass());

//    @GetMapping
//    public List<Note> home() {
//        return  noteRepository.findAll();
//    }

    @GetMapping
    public ResponseEntity<List<Note>> home() {
        LOG.info("Return list of notes");
        return  new ResponseEntity<List<Note>>(noteService.getNotes(), HttpStatus.OK);
    }
}
