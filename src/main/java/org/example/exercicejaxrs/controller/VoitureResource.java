package org.example.exercicejaxrs.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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
    @GET
    @Path("{id}")
    public Voiture getVoiture(@PathParam("id") int id) {

        return serviceVoiture.getVoiture(id);
    }

}