//package com.harsh.restapi2.controller;
//
//import com.harsh.restapi2.entity.JornalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController  //@Component +
//@RequestMapping("/_journal")
//public class JournalEnteryController {
//
//    private Map<Long, JornalEntry>  jurnalEntres= new HashMap<>();
//
////    @GetMapping("/abc")
//    @GetMapping   //http://localhost:8080/journal
//    public List<JornalEntry> getAll(){
//        return new ArrayList<>(jurnalEntres.values());
//    }
//
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JornalEntry myEntry){
//        jurnalEntres.put(myEntry.getId(),myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myid}")
//    public JornalEntry getJournaqlEntrybyId(@PathVariable long myid){
//        return jurnalEntres.get(myid);
//    }
//
//    @DeleteMapping("id/{myid}")
//    public JornalEntry deleteJournaqlEntrybyId(@PathVariable long myid){
//        return jurnalEntres.remove(myid);
//    }
//
//    @PutMapping("id/{myid}")
//    public JornalEntry UpdateJournaqlEntrybyId(@PathVariable long myid , @RequestBody JornalEntry myentry){
//        return  jurnalEntres.put(myid,myentry);
//    }
//}
