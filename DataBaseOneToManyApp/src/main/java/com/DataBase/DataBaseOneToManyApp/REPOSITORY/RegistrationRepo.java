package com.DataBase.DataBaseOneToManyApp.REPOSITORY;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {
}
