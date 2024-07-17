package org.example.exercicejaxrs.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.exercicejaxrs.model.Voiture;
import org.example.exercicejaxrs.service.ServiceVoiture;

import java.util.List;

@Path("/voitures")
@Produces(MediaType.APPLICATION_JSON)
public class VoitureResource {

    private final ServiceVoiture serviceVoiture;

    @Inject
    public VoitureResource(ServiceVoiture serviceVoiture) {
        this.serviceVoiture = serviceVoiture;
    }

    @GET
    public List<Voiture> getVoitures() {

     return serviceVoiture.getVoitures();
        //return "Bonjour les voitures de toto!";
    }
}