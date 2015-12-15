package com.dazah.api.client.controllers;

import com.dazah.api.client.models.ListResponse;
import com.dazah.api.client.models.conversations.Response;
import com.dazah.api.client.models.conversations.User;
import com.dazah.api.client.models.conversations.statuses.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by usbportnoy on 12/13/15.
 */
@Path("report")
public interface Reports {
    @GET
    Response get(
            @QueryParam("access_token") String accessToken,
            @QueryParam("filter") String filter,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("active")
    Response active(
            @QueryParam("access_token") String accessToken,
            @QueryParam("filter") String filter
    );

    @GET
    @Path("active/status")
    ListResponse<Status> status(
            @QueryParam("access_token") String accessToken,
            @QueryParam("offset") int offset
    );

    @GET
    @Path("users")
    ListResponse<User> users(
            @QueryParam("access_token") String accessToken,
            @QueryParam("order_by") String orderBy,
            @QueryParam("offset") int offset
    );

}
