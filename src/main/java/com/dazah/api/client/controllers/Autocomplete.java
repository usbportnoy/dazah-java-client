package com.dazah.api.client.controllers;


import com.dazah.api.client.models.ListResponse;
import com.dazah.api.client.models.autocomplete.CategoryResult;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by usbportnoy on 12/9/15.
 */
@Path("autocomplete")
public interface Autocomplete {
    @GET
    @Path("search")
    @Produces("application/x-www-form-urlencoded")
    ListResponse<CategoryResult> search(
            @QueryParam("access_token") String accessToken,
            @QueryParam("query") String query
    );
}
