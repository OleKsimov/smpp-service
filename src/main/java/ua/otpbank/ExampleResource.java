package ua.otpbank;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class ExampleResource {

    @POST
    public Response sendMessage() {
        return null;
    }
}