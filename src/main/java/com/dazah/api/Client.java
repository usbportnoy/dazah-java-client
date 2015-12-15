package com.dazah.api;

import com.dazah.api.client.controllers.Autocomplete;
import com.dazah.api.client.models.ListResponse;
import com.dazah.api.client.models.autocomplete.CategoryResult;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Hello world!
 */
class Client {
    public static void main(String[] args) {
        String token = "5962546b64716446453144446d72744564566939313433635336626e32375458576c2f4a56637372745533424f574c3978384b497a504f62673255474f694e6e493352665336733433354256396867446b6b4a44534b58776e417a365848476d39534c352f656b3178333633446f6e54422b2f4270744735456a7533737a6c394a7a69577364652f6e4a6d49634671454337753354466d49664456513356314e656e31714572586346375768545575435368673362584b544c4e714b3075413959516a4f736e5a58422f7a444757595354384d7450534f5974326937736c4c634b7943425854333141306a4832517233364c3864306e616f5a44594f71347334346232716e505a586b6c634142476558622f394254747755544f582b7077756e42385a6f2b62434f3335356132514f2f69576e4b526e727066637a4245464b2b3565766b64664d2b397436496e4a764c75585a3633513d3d";
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://www.dazah.com/api/");
        Autocomplete autocomplete = target.proxy(Autocomplete.class);
        ListResponse<CategoryResult> jason = autocomplete.search(token, "Jason");
    }
}
