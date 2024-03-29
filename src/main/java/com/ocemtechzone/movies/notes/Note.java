package com.ocemtechzone.movies.notes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {

//    @Id
//    private ObjectId Id;
//    return date and time
    @Id
    private String id;
    private  String text;
    private String title;
    private String createdAt;
    private String updatedAt;
}
