package com.harsh.restapi2.service;

import com.harsh.restapi2.entity.JornalEntry;
import com.harsh.restapi2.repository.JornalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JornalEntryService {

    @Autowired
    private JornalEntryRepository jornalEntryRepository;

    public void saveEntry(JornalEntry jornalEntry){

        jornalEntryRepository.save(jornalEntry);

    }
    public List<JornalEntry> getAll(){
        return  jornalEntryRepository.findAll();

    }

    public Optional<JornalEntry>  findById(ObjectId obj){
        return jornalEntryRepository.findById(obj);
    }

    public void  deleteById(ObjectId id){
        jornalEntryRepository.deleteById(id);
    }


}
