package com.harsh.restapi2.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("users")
@Getter
@Setter
public class User {

    @Indexed(unique = true)
    @NonNull
    private String userName;
    @NonNull
    private  String password;
    @Id
    private ObjectId id;

    @DBRef  //FK
    private List<JornalEntry> jornalEntries = new ArrayList<>();


}
