package com.DataBase.DataBaseOneToManyApp.CONTROLLER;

import com.DataBase.DataBaseOneToManyApp.ENTITY.Registration;
import com.DataBase.DataBaseOneToManyApp.SERVICE.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService service;

    @GetMapping("/all")
    public List<Registration> allRegistrations() {
        return service.getAllRegisters();
    }

    @GetMapping("one/{id}")
    public Registration getRegistration(@PathVariable int id){
        return service.getOneRegister(id);
    }

    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return service.addRegister(registration);
    }

    @DeleteMapping("delete/{id}")
    public void deleteRegistration(@PathVariable int id) {
        service.deleteRegister(id);
    }
}

