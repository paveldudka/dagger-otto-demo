package com.inrix.models;

import com.inrix.network.IHttpClient;

import javax.inject.Inject;

/**
 * Created by paveld on 11/18/13.
 */
public class Authenticator{

    private String token;
    private IHttpClient client;

    @Inject
    public Authenticator(IHttpClient client)
    {
        this.client = client;
    }

    public String getAuthToken() {
        return client.performRequest();
    }
}
