package com.salon.resource;

import com.salon.entity.Appointment;
import com.salon.entity.Client;
import com.salon.entity.Service;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Path("/appointments")
public class AppointmentResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAppointments() {
        // Dummy appointments
        Appointment a1 = new Appointment(
                new Client("Alice Johnson", "alice@example.com", "555-1234"),
                new Service("Swedish Massage", "Relaxing full-body massage", 50.0),
                LocalDateTime.of(2025, 12, 25, 10, 0)
        );

        Appointment a2 = new Appointment(
                new Client("Bob Smith", "bob@example.com", "555-5678"),
                new Service("Facial", "Cleansing facial treatment", 30.0),
                LocalDateTime.of(2025, 12, 25, 12, 0)
        );

        return Arrays.asList(a1, a2);
    }
}
