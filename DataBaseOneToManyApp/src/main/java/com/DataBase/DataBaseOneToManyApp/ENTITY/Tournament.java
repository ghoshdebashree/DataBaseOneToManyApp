package com.DataBase.DataBaseOneToManyApp.ENTITY;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "tournament_id" )
    private List<Registration> registrationList = new ArrayList<>();


    //adding multiple registrations
    public void addRegistration(Registration registration){
        registrationList.add(registration);
    }

    //removing a registration
    public void removeRegistration(Registration registration){
        if(!registrationList.isEmpty()){
            registrationList.remove(registration);
        }
    }

}
