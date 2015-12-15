package com.dazah.api.client.controllers.conversations;

import com.dazah.api.client.models.conversations.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by usbportnoy on 12/13/15.
 */
@Path("conversations/report")
public interface Reports {
    @GET
    Response get(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("follow-up")
    Response followUp(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("introductions")
    Response introductions(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("new")
    Response unseen(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("online")
    Response online(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("unreplied")
    Response unreplied(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );
}
