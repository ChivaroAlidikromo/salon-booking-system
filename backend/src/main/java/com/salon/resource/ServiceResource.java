package com.salon.resource;

import com.salon.entity.Service;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/services")
public class ServiceResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Service> getServices() {
        // For now, return dummy data
        return Arrays.asList(
                new Service("Swedish Massage", "Relaxing full-body massage", 50.0),
                new Service("Facial", "Cleansing facial treatment", 30.0)
        );
    }
}
