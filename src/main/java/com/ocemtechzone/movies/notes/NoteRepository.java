package com.ocemtechzone.movies.notes;

import com.ocemtechzone.movies.notes.Note;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, ObjectId> {
}
