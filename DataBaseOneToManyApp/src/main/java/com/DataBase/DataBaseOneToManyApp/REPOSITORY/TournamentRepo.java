package com.DataBase.DataBaseOneToManyApp.REPOSITORY;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepo extends JpaRepository<Tournament, Integer> {
}
