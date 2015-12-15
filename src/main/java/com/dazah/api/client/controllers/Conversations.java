package com.dazah.api.client.controllers;

import com.dazah.api.client.models.conversations.Response;

import javax.ws.rs.*;

/**
 * Created by usbportnoy on 12/13/15.
 */
@Path("conversations")
public interface Conversations {

    @GET
    @Path("{ids}")
    Response get(
            @PathParam("ids") String ids,
            @QueryParam("access_token") String accessToken
    );

    @GET
    @Path("{id}/search")
    Response search(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("query") String query,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("{id}/messages")
    com.dazah.api.client.models.messages.Response messages(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("message_id") int messageId,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("{id}/messages")
    com.dazah.api.client.models.messages.Response messages(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );

    @GET
    @Path("{id}/poll")
    com.dazah.api.client.models.messages.Response poll(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("message_id") int messageId,
            @QueryParam("time_limit") int timeLimit,
            @QueryParam("include_self") boolean includeSelf
    );

    @POST
    @Path("{id}/post")
    com.dazah.api.client.models.messages.Response post(
            @PathParam("id") String id,
            @FormParam("access_token") String accessToken,
            @FormParam("message") String message
    );

    @GET
    @Path("{id}/archive")
    com.dazah.api.client.models.conversations.archives.Response archive(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );

    @GET
    @Path("{id}/unarchive")
    com.dazah.api.client.models.conversations.archives.Response unarchive(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );
}
