package com.ocemtechzone.movies.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public  List<Note> getNotes() {
        return noteRepository.findAll();
    }

}
