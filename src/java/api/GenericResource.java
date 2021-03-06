/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author Pernille
 */
@Path("person")
public class GenericResource
{

    @Context
    private UriInfo context;
    DataFactory f = new DataFactory();

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource()
    {
        
    }

    /**
     * Retrieves representation of an instance of api.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson()
    {
        return f.getMembersAsJson();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content)
    {
    }
}
