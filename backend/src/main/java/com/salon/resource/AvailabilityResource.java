package com.salon.resource;

import com.salon.entity.Availability;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Path("/availability")
public class AvailabilityResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Availability> getAvailability() {
        return Arrays.asList(
                new Availability(LocalDateTime.of(2025, 12, 25, 9, 0),
                        LocalDateTime.of(2025, 12, 25, 17, 0)),
                new Availability(LocalDateTime.of(2025, 12, 26, 9, 0),
                        LocalDateTime.of(2025, 12, 26, 17, 0))
        );
    }
}
