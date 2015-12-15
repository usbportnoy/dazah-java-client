package com.dazah.api.client.controllers;

import com.dazah.api.client.models.ListResponse;
import com.dazah.api.client.models.conversations.Response;
import com.dazah.api.client.models.conversations.archives.Result;
import com.dazah.api.client.models.conversations.searches.Search;
import com.dazah.api.client.models.messages.Message;

import javax.ws.rs.*;
import java.util.List;

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
    ListResponse<Search> search(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("query") String query,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("{id}/messages")
    ListResponse<Message> messages(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("message_id") int messageId,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("{id}/messages")
    ListResponse<Message> messages(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );

    @GET
    @Path("{id}/poll")
    ListResponse<Message> poll(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken,
            @QueryParam("message_id") int messageId,
            @QueryParam("time_limit") int timeLimit,
            @QueryParam("include_self") boolean includeSelf
    );

    @POST
    @Path("{id}/post")
    ListResponse<Message> post(
            @PathParam("id") String id,
            @FormParam("access_token") String accessToken,
            @FormParam("message") String message
    );

    @GET
    @Path("{id}/archive")
    com.dazah.api.client.models.SingleResponse<Result> archive(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );

    @GET
    @Path("{id}/unarchive")
    com.dazah.api.client.models.SingleResponse<Result> unarchive(
            @PathParam("id") String id,
            @QueryParam("access_token") String accessToken
    );
}
