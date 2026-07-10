package com.harsh.restapi2.controller;

import com.harsh.restapi2.entity.JornalEntry;
import com.harsh.restapi2.service.JornalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController  //@Component +
@RequestMapping("/journal")
public class JournalEnteryControllerV2 {

    @Autowired
    private JornalEntryService jornalEntryService;

//    @GetMapping("/abc")
    @GetMapping   //http://localhost:8080/journal
    public List<JornalEntry> getAll(){
        return jornalEntryService.getAll();
    }


    @PostMapping
    public JornalEntry createEntry(@RequestBody JornalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        jornalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myid}")
    public JornalEntry getJournaqlEntrybyId(@PathVariable ObjectId myid) {
        return jornalEntryService.findById(myid).orElse(null);
    }

    @DeleteMapping("id/{myid}")
    public boolean deleteJournaqlEntrybyId(@PathVariable ObjectId myid){
        jornalEntryService.deleteById(myid);
        return true;
    }

    @PutMapping("id/{myid}")
    public JornalEntry UpdateJournaqlEntrybyId(@PathVariable ObjectId myid , @RequestBody JornalEntry newentry){
        JornalEntry old = jornalEntryService.findById(myid).orElse(null);
        if(old!=null){
            old.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? newentry.getTitle() : old.getTitle());
            old.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? newentry.getContent() : old.getContent());
        }
        jornalEntryService.saveEntry(old);
        return old;
}
}
// controller --> srvices --> repository