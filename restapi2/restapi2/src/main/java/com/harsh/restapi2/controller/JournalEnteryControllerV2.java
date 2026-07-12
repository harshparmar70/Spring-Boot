package com.harsh.restapi2.controller;

import com.harsh.restapi2.entity.JornalEntry;
import com.harsh.restapi2.service.JornalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController  //@Component +
@RequestMapping("/journal")
public class JournalEnteryControllerV2 {

    @Autowired
    private JornalEntryService jornalEntryService;

//    @GetMapping("/abc")
    @GetMapping   //http://localhost:8080/journal
    public ResponseEntity<?> getAll(){

        List<JornalEntry> list =  jornalEntryService.getAll();
        if(!list.isEmpty() && list !=null){
            return new  ResponseEntity<>(list,HttpStatus.OK);
        }
        return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping
    public ResponseEntity<JornalEntry> createEntry(@RequestBody JornalEntry myEntry){
        try{
            myEntry.setDate(LocalDateTime.now());
            jornalEntryService.saveEntry(myEntry);
            return new ResponseEntity<>(myEntry,HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("id/{myid}")
    public ResponseEntity<JornalEntry> getJournaqlEntrybyId(@PathVariable ObjectId myid) {
        Optional<JornalEntry>  jornalEntry =  jornalEntryService.findById(myid);
        if(jornalEntry.isPresent()){
            return new ResponseEntity<>(jornalEntry.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{myid}")
    public ResponseEntity<?> deleteJournaqlEntrybyId(@PathVariable ObjectId myid){
        jornalEntryService.deleteById(myid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("id/{myid}")
    public ResponseEntity<JornalEntry> UpdateJournaqlEntrybyId(@PathVariable ObjectId myid , @RequestBody JornalEntry newentry){
        JornalEntry old = jornalEntryService.findById(myid).orElse(null);
        if(old!=null){
            old.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? newentry.getTitle() : old.getTitle());
            old.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? newentry.getContent() : old.getContent());
            jornalEntryService.saveEntry(old);
            return new ResponseEntity<>(newentry,HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}
// controller --> srvices --> repository