package com.DataBase.DataBaseOneToManyApp.SERVICE;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Registration;
import com.DataBase.DataBaseOneToManyApp.ENTITY.Tournament;
import com.DataBase.DataBaseOneToManyApp.REPOSITORY.TournamentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    @Autowired
    private TournamentRepo repo;

    public List<Tournament> allTournaments() {
        return repo.findAll();
    }

    public Tournament getTournament(int id){
        return repo.findById(id).get();
    }

    public Tournament addTournament(Tournament tournament) {
        tournament.setId(0);
        return repo.save(tournament);
    }

    public void deleteTournament(int id) {
        repo.deleteById(id);
    }

    public Tournament addRegistration(Registration registration, int id){
        Tournament tournament = repo.findById(id).get();
        tournament.addRegistration(registration);
        return repo.save(tournament);
    }
    public Tournament deleteRegistration(Registration registration, int id){
        Tournament tournament = repo.findById(id).get();
        tournament.removeRegistration(registration);
        return repo.save(tournament);
    }
}
