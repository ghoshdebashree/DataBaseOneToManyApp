package com.DataBase.DataBaseOneToManyApp.SERVICE;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Registration;
import com.DataBase.DataBaseOneToManyApp.REPOSITORY.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo registrationRepo;

    public List<Registration> getAllRegisters(){
        return registrationRepo.findAll();
    }

    public Registration getOneRegister(int id){
        return registrationRepo.findById(id).get();
    }

    public Registration addRegister(Registration registration){
        return registrationRepo.save(registration);
    }
    public void deleteRegister(int id){
         registrationRepo.deleteById(id);
    }
}
