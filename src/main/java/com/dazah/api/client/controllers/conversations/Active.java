package com.dazah.api.client.controllers.conversations;

import com.dazah.api.client.models.conversations.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


/**
 * Created by usbportnoy on 12/12/15.
 */
@Path("conversations/active")
public interface Active {
/*  GET conversations/active
    GET conversations/active/follow-up
    GET conversations/active/introductions
    GET conversations/active/new
    GET conversations/active/online
    GET conversations/active/unreplied*/

    @GET
    Response get(@QueryParam("access_token") String accessToken);

    @GET
    @Path("follow-up")
    Response followUp(@QueryParam("access_token") String accessToken);

    @GET
    @Path("introductions")
    Response introductions(@QueryParam("access_token") String accessToken);

    @GET
    @Path("new")
    Response unseen(@QueryParam("access_token") String accessToken);

    @GET
    @Path("online")
    Response online(@QueryParam("access_token") String accessToken);

    @GET
    @Path("unreplied")
    Response unreplied(@QueryParam("access_token") String accessToken);






}
