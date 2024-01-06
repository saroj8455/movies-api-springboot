package com.ocemtechzone.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/notes")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;
    @GetMapping
    public List<Note> home() {
        return  noteRepository.findAll();
    }
}
