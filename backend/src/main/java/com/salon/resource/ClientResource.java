package com.salon.resource;

import com.salon.entity.Client;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/clients")
public class ClientResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getClients() {
        return Arrays.asList(
                new Client("Alice Johnson", "alice@example.com", "555-1234"),
                new Client("Bob Smith", "bob@example.com", "555-5678")
        );
    }
}
