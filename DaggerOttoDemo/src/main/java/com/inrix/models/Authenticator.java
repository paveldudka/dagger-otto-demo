package com.inrix.models;

import com.inrix.network.IHttpClient;

/**
 * Created by paveld on 11/18/13.
 */
public class Authenticator{

    private String token;
    private IHttpClient client;

    public Authenticator(IHttpClient client)
    {
        this.client = client;
    }

    public String getAuthToken() {
        return client.performRequest();
    }
}
