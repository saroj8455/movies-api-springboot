package com.ocemtechzone.movies.notes;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//    @RequestMapping(value = "/{noteId}",method = RequestMethod.GET) another approach
    @GetMapping("/{noteId}")
    public ResponseEntity<Optional<Note>> getNoteById(@PathVariable ObjectId noteId) {
        LOG.info("noteId: "+noteId);
        return new ResponseEntity<Optional<Note>>(noteService.getNoteById(noteId),HttpStatus.OK);
    }
}
