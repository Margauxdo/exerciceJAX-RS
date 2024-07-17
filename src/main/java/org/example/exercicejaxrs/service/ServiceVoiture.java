package org.example.exercicejaxrs.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exercicejaxrs.model.Voiture;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ServiceVoiture {


    public List<Voiture> getVoitures() {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture("audi", 2012, "grey"));
        voitures.add(new Voiture("renaud", 2002, "blue"));
        voitures.add(new Voiture("megane", 2024, "white"));
        return voitures;
    }

    public Voiture getVoiture(int id) {
        return new Voiture("audi", 2012, "grey");
    }
}

//create,update,delete