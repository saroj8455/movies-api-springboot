package com.ocemtechzone.movies.notes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public  List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(ObjectId noteId) {
        return noteRepository.findById(noteId);
    }

}
