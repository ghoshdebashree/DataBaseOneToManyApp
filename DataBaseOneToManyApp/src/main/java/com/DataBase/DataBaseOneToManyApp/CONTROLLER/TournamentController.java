package com.DataBase.DataBaseOneToManyApp.CONTROLLER;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Registration;
import com.DataBase.DataBaseOneToManyApp.ENTITY.Tournament;
import com.DataBase.DataBaseOneToManyApp.SERVICE.RegistrationService;
import com.DataBase.DataBaseOneToManyApp.SERVICE.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TournamentController {
    @Autowired
    private TournamentService service;
    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/tounaments")
    public List<Tournament> getAll(){
        return service.allTournaments();
    }
    @GetMapping("/tournament/{id}")
    public Tournament getOneTournament(@PathVariable int id){
        return service.getTournament(id);
    }

    @PostMapping("/addtournament")
    public Tournament addTournament(@RequestBody Tournament tournament){
        return service.addTournament(tournament);
    }
    @DeleteMapping("/deleteTournament/{id}")
    public void delete(@PathVariable int id){
        service.deleteTournament(id);
    }

    @PutMapping("/addTour/{id}/addReg/{registration_id}")
    public Tournament addReg(@PathVariable int id, @PathVariable int registration_id){
        Registration registration = registrationService.getOneRegister(registration_id);
        return service.addRegistration(registration,id);
    }
    @PutMapping("/removeTour/{id}/remove_registrations/{registration_id}")
    public Tournament removeReg(@PathVariable int id, @PathVariable int registration_id){
        Registration registration = registrationService.getOneRegister(registration_id);
        return  service.deleteRegistration(registration, id);
    }
}
