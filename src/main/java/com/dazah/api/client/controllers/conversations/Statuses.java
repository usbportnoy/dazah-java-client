package com.dazah.api.client.controllers.conversations;


import com.dazah.api.client.models.conversations.statuses.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by usbportnoy on 12/13/15.
 */
@Path("conversations/status")
public interface Statuses {
    @GET
    Response get(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("active")
    Response active(@QueryParam("access_token") String accessToken);
}
