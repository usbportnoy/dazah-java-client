package com.dazah.api;

import com.dazah.api.client.controllers.Autocomplete;
import com.dazah.api.client.controllers.Conversations;
import com.dazah.api.client.models.conversations.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.spi.BadRequestException;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        String token = "";
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://www.dazah.com/api/");
        Autocomplete autocomplete = target.proxy(Autocomplete.class);
        autocomplete.search(token, "Jason");
    }
}
